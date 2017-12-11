/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massim.javaagents.percept;

import massim.javaagents.percept.storageItem;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Sarah
 */
public class storage {
    private String name;
    private double lat;
    private double lon;
    private int totalCapacity;
    private int usedCapacity;
    
    //items
    List <storageItem> items = new Vector<>();

    
    public storage() {
    }

    public storage(String name, double lat, double lon, int totalCapacity, int usedCapacity, List<storageItem> items) {
        this.name = name;
        this.lat = lat;
        this.lon = lon;
        this.totalCapacity = totalCapacity;
        this.usedCapacity = usedCapacity;
        this.items = items;
    }

    public List<storageItem> getItems() {
        return items;
    }

    public void setItems(List<storageItem> items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(int usedCapacity) {
        this.usedCapacity = usedCapacity;
    }
    
}
