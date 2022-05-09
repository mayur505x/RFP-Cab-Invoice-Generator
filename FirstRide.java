package com.bridgelabz;

public class FirstRide {
    public double calculateFare(double distance, double time) {
        
        double totalFare = 10 * distance + 1 * time;

        if (totalFare > 5) {
            return totalFare;
        } else {
            return totalFare = 5;
        }
    }
}
