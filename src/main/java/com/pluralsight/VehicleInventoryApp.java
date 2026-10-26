package com.pluralsight;

public class VehicleInventoryApp {

    public static void main(String[] args) {

        Vehicle[] cars = new Vehicle[2];

        cars[0] = new Vehicle("Honda Civic");
        cars[1]= new Vehicle("Ford Explorer");

        System.out.println("Here's a list of vehicles:");

        for (int i = 0; i < cars.length; i++){
            System.out.println("Make and model: " + cars[i].getMakeModel());
        }




    }
}
