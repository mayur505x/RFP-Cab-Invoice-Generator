package com.bridgelabz;

public class CabRideDetails {
    private String rideNames;
    private double distance;
    private double time;
    private double totalCostOfFare;

    public String getRideName() {
        return rideNames;
    }

    public void setRideName(String rideNames) {
        this.rideNames = rideNames;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTotalCostOfFare() {
        return totalCostOfFare;
    }

    public void setTotalCostOfFare(double totalCostOfFare) {
        this.totalCostOfFare = totalCostOfFare;
    }
}
