package com.mycompany.app.main; // Package for main application class

import com.mycompany.app.models.Car; // Import Car class

public class VehicleApp {

    public static void main(String[] args) {
        // Create a Car object with brand, model, year, and price
        Car car = new Car("Honda", "Civic", 2026, 40000.00);

        car.displayInfo(); // Display all car details
        car.start();       // Start the car
        car.stop();        // Stop the car
    }
}
