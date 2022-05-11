package com.bridgelabz;

public class CabInvoiceGenerator {
    public double calculateFare(double distance, double time) {

        double totalFare = 10 * distance + 1 * time;

        if (totalFare > 5) {
            return totalFare;
        } else {
            return totalFare = 5;
        }
    }

    public double calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride:rides) {
            totalFare += this.calculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }
}