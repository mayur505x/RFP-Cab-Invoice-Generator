package com.bridgelabz;


import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestFare {

    @Test
    public void givenDistanceAndTimeWhenCalculatedShouldReturnTotalFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double totalFare = cabInvoiceGenerator.calculateFare(10,2);
        Assert.assertEquals(102, totalFare);
    }
    @Test
    public void givenDistanceAndTimeWhenCalculatedShouldReturnMinimumRideFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double totalFare = cabInvoiceGenerator.calculateFare(0.2, 2);
        Assert.assertEquals(5, totalFare);
    }
    @Test
    public void givenMultipleRidesCalculatedShouldReturnRidesTotalFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        Ride[] rides = {new Ride(10.0, 2.0),
                        new Ride(5,2.0)
                       };
        double totalFare = cabInvoiceGenerator.calculateFare(rides);
        Assert.assertEquals(154,totalFare);
    }
}
