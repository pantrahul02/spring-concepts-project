package org.example.beans;

public class Bike implements Vehicle{
    @Override
    public void move() {
        System.out.println("Bike is moving...");
    }
}
