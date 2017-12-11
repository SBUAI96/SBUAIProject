/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massim.javaagents.percept;

/**
 *
 * @author Sarah
 */
public class chargingStation {
    private String name;
    private double lat;
    private double lon;
    private int rate;

    public chargingStation(String name, double lat, double lon, int rate) {
        this.name = name;
        this.lat = lat;
        this.lon = lon;
        this.rate = rate;
    }

    public chargingStation() {
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

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    
}
