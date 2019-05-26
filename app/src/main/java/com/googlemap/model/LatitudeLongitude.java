package com.googlemap.model;

public class LatitudeLongitude {
    private double lat, lon;
    private String maker;

    public LatitudeLongitude(double lat, double lon, String maker) {
        this.lat = lat;
        this.lon = lon;
        this.maker = maker;
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

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}
