/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massim.javaagents.percept;

import java.util.List;

/**
 *
 * @author Sarah
 */
public class auction {
    
        private String auctionID;
        private String auctionStorage;
        private int auctionReward;
        private int auctionStart;
        private int auctionEnd;
        private int auctionFine;
        private int auctionLowestBid;
        private int auctionTime;
        private List<Pair<String,Integer>> auctionRequireds;

    public auction() {
    }
    public auction(auction tempauction) {
        this.auctionEnd = tempauction.getAuctionEnd();
        this.auctionFine = tempauction.getAuctionFine();
        this.auctionID = tempauction.getAuctionID();
        this.auctionLowestBid = tempauction.getAuctionLowestBid();
        this.auctionRequireds = tempauction.getAuctionRequireds();
        this.auctionReward = tempauction.getAuctionReward();
        this.auctionStart = tempauction.getAuctionStart();
        this.auctionStorage = tempauction.getAuctionStorage();
        this.auctionTime = tempauction.getAuctionTime();
    }
    public auction(String auctionID, String auctionStorage, int auctionReward, int auctionStart, int auctionEnd, int auctionFine, int auctionLowestBid, int auctionTime, List<Pair<String, Integer>> auctionRequireds) {
        this.auctionID = auctionID;
        this.auctionStorage = auctionStorage;
        this.auctionReward = auctionReward;
        this.auctionStart = auctionStart;
        this.auctionEnd = auctionEnd;
        this.auctionFine = auctionFine;
        this.auctionLowestBid = auctionLowestBid;
        this.auctionTime = auctionTime;
        this.auctionRequireds = auctionRequireds;
    }

    public String getAuctionID() {
        return auctionID;
    }

    public void setAuctionID(String auctionID) {
        this.auctionID = auctionID;
    }

    public String getAuctionStorage() {
        return auctionStorage;
    }

    public void setAuctionStorage(String auctionStorage) {
        this.auctionStorage = auctionStorage;
    }

    public int getAuctionReward() {
        return auctionReward;
    }

    public void setAuctionReward(int auctionReward) {
        this.auctionReward = auctionReward;
    }

    public int getAuctionStart() {
        return auctionStart;
    }

    public void setAuctionStart(int auctionStart) {
        this.auctionStart = auctionStart;
    }

    public int getAuctionEnd() {
        return auctionEnd;
    }

    public void setAuctionEnd(int auctionEnd) {
        this.auctionEnd = auctionEnd;
    }

    public int getAuctionFine() {
        return auctionFine;
    }

    public void setAuctionFine(int auctionFine) {
        this.auctionFine = auctionFine;
    }

    public int getAuctionLowestBid() {
        return auctionLowestBid;
    }

    public void setAuctionLowestBid(int auctionLowestBid) {
        this.auctionLowestBid = auctionLowestBid;
    }

    public int getAuctionTime() {
        return auctionTime;
    }

    public void setAuctionTime(int auctionTime) {
        this.auctionTime = auctionTime;
    }

    public List<Pair<String, Integer>> getAuctionRequireds() {
        return auctionRequireds;
    }

    public void setAuctionRequireds(List<Pair<String, Integer>> auctionRequireds) {
        this.auctionRequireds = auctionRequireds;
    }
    public boolean compareTo(auction tempJob)
    {
        if( this.auctionID.compareTo(tempJob.auctionID)==0 )
            return true;
        return false;
    }  
        
}
