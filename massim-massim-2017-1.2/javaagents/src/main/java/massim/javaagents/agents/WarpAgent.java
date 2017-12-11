package massim.javaagents.agents;

import eis.iilang.*;
import massim.javaagents.MailService;

import java.util.*;
import massim.javaagents.percept.AgentPercepts;
import massim.javaagents.percept.auction;
import massim.javaagents.percept.job;
import massim.javaagents.percept.resourceNode;
import massim.javaagents.percept.self;
import massim.javaagents.percept.shop;

/**
 * This agent is intended to be used with the QuickTest.json config.
 * It assumes it can warp to any place with the goto action (since it moves incredibly fast).
 * Also, it plans very statically and may break easily (because of that).
 * Also, it cannot assemble yet.
 */
public class WarpAgent extends Agent{
    
    private AgentPercepts AP = new AgentPercepts(); 
    private Set<String> jobsTaken = new HashSet<>();
    private String myJob;

    private Queue<Action> actionQueue = new LinkedList<>();

    private boolean test = false;

    /**
     * Constructor.
     *
     * @param name    the agent's name
     * @param mailbox the mail facility
     */
    public WarpAgent(String name, MailService mailbox) {
        super(name, mailbox);
    }

    @Override
    public void handlePercept(Percept percept) {} // this is not configured to be called

    void makePerceptObjects()
    {
        List<Percept> percepts = new Vector<>();
        percepts = this.getPercepts();
        
        ///*** Changing percepts handle
        AP.setPercepts(percepts);
        if(getStepNumber() != 0) //Step Percept
        {
           
            AP.stepPercept();
        }
        else //Initial Percept
        {
            AP.initialize();
        }
        AP.getSelfInfo().setName(this.getName());
        ///***
    }

    @Override
    public Action step() {
        
        //Percept
        makePerceptObjects();
        


        say("Last step I did " + AP.getSelfInfo().getLastAction());

        if(AP.getSelfInfo().getCarriedItems().isEmpty()==false){
            say("I carry some items");
        }

        say("I am at " + AP.getSelfInfo().getLon() + " " + AP.getSelfInfo().getLat());

        if(AP.getResourceNodes().isEmpty()==false){
            for(resourceNode nodeInfo: AP.getResourceNodes()){
                say(nodeInfo.getName());
            }
        }

        //test gather action
        if(test==false){
            actionQueue.add(new Action("goto", new Identifier("resourceNode2")));
            actionQueue.add(new Action("gather"));
            test=true;
        }

        // follow the plan if there is one
        if(actionQueue.size() > 0) return actionQueue.poll();

        if (myJob == null){
            Set<String> availableJobs = new HashSet<>(AP.Jobs.keySet());
            Set<String> availableMissions = new HashSet<>(AP.Missions.keySet());
            availableJobs.removeAll(jobsTaken);
            availableMissions.removeAll(jobsTaken);
       
            if(availableJobs.size() > 0){
                myJob = availableJobs.iterator().next();
                say("I will complete " + myJob);
                jobsTaken.add(myJob);
                broadcast(new Percept("taken", new Identifier(myJob)), getName());
            }
             else if(availableMissions.size() > 0)
            {
                myJob = availableMissions.iterator().next(); 
              say("I will complete " + myJob);
                jobsTaken.add(myJob);
                broadcast(new Percept("taken", new Identifier(myJob)), getName());
            }
        }
        if(myJob != null){
            // plan the job
            // 1. acquire items
            job currentJob = AP.Jobs.get(myJob);
            
            if(currentJob == null){
                say("I lost my job :(");
                myJob = null;
                return new Action("skip");
            }
            String storage = currentJob.getJobStorage();
            String itemName = currentJob.getJobRequireds().get(0).getLeft();
            int amount = currentJob.getJobRequireds().get(0).getRight();
            // find a shop selling the item
            List<shop> shops = AP.shopsByItem.get(itemName);
            String shop = "";
            if(shops.size() == 0){
                    say("I cannot buy the item " + itemName + "; this plan won't work very well.");
                    }
                    else{
                        say("I will go to the shop first.");
                        // go to the shop
                        shop = shops.get(0).getShopName();
                        actionQueue.add(new Action("goto", new Identifier(shop)));
                        // buy the items
                        actionQueue.add(new Action("buy", new Identifier(itemName), new Numeral(amount)));
                    }
            
            // 2. get items to storage
            actionQueue.add(new Action("goto", new Identifier(storage)));
            // 2.1 deliver items
            actionQueue.add(new Action("deliver_job", new Identifier(myJob)));
        }

        return actionQueue.peek() != null? actionQueue.poll() : new Action("skip");
    }

    @Override
    public void handleMessage(Percept message, String sender) {
        switch (message.getName()){
            case "taken":
                jobsTaken.add(stringParam(message.getParameters(), 0));
                break;
        }
    }

    /**
     * Tries to extract a parameter from a list of parameters.
     * @param params the parameter list
     * @param index the index of the parameter
     * @return the string value of that parameter or an empty string if there is no parameter or it is not an identifier
     */
    public static String stringParam(List<Parameter> params, int index){
        if(params.size() < index + 1) return "";
        Parameter param = params.get(index);
        if(param instanceof Identifier) return ((Identifier) param).getValue();
        return "";
    }

    /**
     * Tries to extract an int parameter from a list of parameters.
     * @param params the parameter list
     * @param index the index of the parameter
     * @return the int value of that parameter or -1 if there is no parameter or it is not an identifier
     */
    private static int intParam(List<Parameter> params, int index){
        if(params.size() < index + 1) return -1;
        Parameter param = params.get(index);
        if(param instanceof Numeral) return ((Numeral) param).getValue().intValue();
        return -1;
    }

    /**
     * Tries to extract a parameter from a percept.
     * @param p the percept
     * @param index the index of the parameter
     * @return the string value of that parameter or an empty string if there is no parameter or it is not an identifier
     */
    private static ParameterList listParam(Percept p, int index){
        List<Parameter> params = p.getParameters();
        if(params.size() < index + 1) return new ParameterList();
        Parameter param = params.get(index);
        if(param instanceof ParameterList) return (ParameterList) param;
        return new ParameterList();
    }
}
