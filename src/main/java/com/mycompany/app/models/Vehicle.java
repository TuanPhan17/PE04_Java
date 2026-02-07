package com.mycompany.app.models; // Package for all model classes

public class Vehicle { // Base class representing a generic vehicle

    protected String brand; // Stores the brand of the vehicle

    public Vehicle(String brand){ // Constructor to initialize the vehicle brand
        this.brand = brand;
    }

    public void displayInfo(){ // Displays basic vehicle information
        System.out.println("Brand: " + brand);
    }
}
