package com.mycompany.app.models; // Package for model classes

import com.mycompany.app.interfaces.Drivable; // Import Drivable interface

public class Car extends Vehicle implements Drivable {
    // Car extends Vehicle and implements Drivable behavior

    private String model; // Stores the car model
    private int year;     // Stores the car year
    private double price; // Stores the car price

    // Constructor initializes all Car attributes
    public Car(String brand, String model, int year, double price) {
        super(brand);      // Calls Vehicle constructor to set brand
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Overrides displayInfo to include Car-specific details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Displays brand from Vehicle
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    // Implements start behavior from Drivable interface
    @Override
    public void start() {
        System.out.println(model + " is starting.");
    }

    // Implements stop behavior from Drivable interface
    @Override
    public void stop() {
        System.out.println(model + " is stopping.");
    }
}
