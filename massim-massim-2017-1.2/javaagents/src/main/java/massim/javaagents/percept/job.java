/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massim.javaagents.percept;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author Sarah
 */
public class job {
    private String jobID;
    private String jobStorage;
    private int jobReward;
    private int jobStart;
    private int jobEnd;
    private boolean isSimple;
    private List<Pair<String,Integer>> jobRequireds= new Vector<>();

    public job() {
    }
    
    public job(job tempJob) {
        this.jobEnd = tempJob.jobEnd;
        this.jobID = tempJob.jobID;
        this.jobRequireds = tempJob.jobRequireds;
        this.jobReward = tempJob.jobReward;
        this.jobStart = tempJob.jobStart;
        this.jobStorage = tempJob.jobStorage;
        this.isSimple = tempJob.isSimple;
    }
    public job(String jobID, String jobStorage, int jobReward, int jobStart, int jobEnd , List<Pair<String,Integer>> jobRequireds,boolean isSimple ) {
        this.jobID = jobID;
        this.jobStorage = jobStorage;
        this.jobReward = jobReward;
        this.jobStart = jobStart;
        this.jobEnd = jobEnd;
        this.jobRequireds = jobRequireds;
        this.isSimple = isSimple;
    }

    public boolean isIsSimple() {
        return isSimple;
    }

    public void setIsSimple(boolean isSimple) {
        this.isSimple = isSimple;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public String getJobStorage() {
        return jobStorage;
    }

    public void setJobStorage(String jobStorage) {
        this.jobStorage = jobStorage;
    }

    public int getJobReward() {
        return jobReward;
    }

    public void setJobReward(int jobReward) {
        this.jobReward = jobReward;
    }

    public int getJobStart() {
        return jobStart;
    }

    public void setJobStart(int jobStart) {
        this.jobStart = jobStart;
    }

    public int getJobEnd() {
        return jobEnd;
    }

    public void setJobEnd(int jobEnd) {
        this.jobEnd = jobEnd;
    }

    public List<Pair<String, Integer>> getJobRequireds() {
        return jobRequireds;
    }

    public void setJobRequireds(List<Pair<String, Integer>> jobRequireds) {
        this.jobRequireds = jobRequireds;
    }
    public boolean compareTo(job tempJob)
    {
        if( this.jobID.compareTo(tempJob.jobID)==0 )
            return true;
        return false;
    }
    
    
}
