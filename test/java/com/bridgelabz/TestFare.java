package com.bridgelabz;


import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestFare {

    @Test
    public void givenDistanceAndTimeWhenCalculatedShouldReturrnTotalFare() {
        FirstRide rideFare = new FirstRide();
        double totalFare = rideFare.calculateFare(10,2);
        Assert.assertEquals(102, totalFare);
    }
    @Test
    public void givenDistanceAndTimeWhenCalculatedShouldReturnMinimumRideFare() {
        FirstRide minimumRideFare = new FirstRide();
        double totalFare = minimumRideFare.calculateFare(0.2, 2);
        Assert.assertEquals(5,totalFare);
    }



}
