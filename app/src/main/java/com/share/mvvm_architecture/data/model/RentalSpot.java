package com.share.mvvm_architecture.data.model;

import com.google.gson.annotations.SerializedName;

public class RentalSpot {
    @SerializedName("office_id")
    private int office_id;
    @SerializedName("office_name")
    private String office_name;
    @SerializedName("office_location")
    private String office_location;
    @SerializedName("lat")
    private double lat;
    @SerializedName("lon")
    private double lon;
    @SerializedName("umbrella_count")
    private int umbrella_count;

    private int distance;

    public int getOffice_id() {
        return office_id;
    }

    public String getOffice_name() {
        return office_name;
    }

    public String getOffice_location() {
        return office_location;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public int getUmbrella_count() {
        return umbrella_count;
    }

    public int getDistance() {
        return distance;
    }

    public void setOffice_id(int office_id) {
        this.office_id = office_id;
    }

    public void setOffice_name(String office_name) {
        this.office_name = office_name;
    }

    public void setOffice_location(String office_location) {
        this.office_location = office_location;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public void setUmbrella_count(int umbrella_count) {
        this.umbrella_count = umbrella_count;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public RentalSpot(int office_id, String office_name, String office_location, double lat, double lon, int umbrella_count) {
        this.office_id = office_id;
        this.office_name = office_name;
        this.office_location = office_location;
        this.lat = lat;
        this.lon = lon;
        this.umbrella_count = umbrella_count;
    }
}

