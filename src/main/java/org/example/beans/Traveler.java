package org.example.beans;

public class Traveler {

    private Vehicle vehicle;

    public Traveler(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void startJourny(){
        vehicle.move();
    }
}
