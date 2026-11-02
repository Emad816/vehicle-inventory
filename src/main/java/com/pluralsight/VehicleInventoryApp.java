package com.pluralsight;

import java.util.Scanner;

public class VehicleInventoryApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Vehicle[] inventory = new Vehicle[20];
        int vehicleCount = 0;

        inventory[vehicleCount++] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        inventory[vehicleCount++] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        inventory[vehicleCount++] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        inventory[vehicleCount++] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        inventory[vehicleCount++] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        inventory[vehicleCount++] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        System.out.println("What do you want to do?");
        System.out.println("  1 - List all vehicles");
        System.out.println("  2 - Search by make/model");
        System.out.println("  3 - Search by price range");
        System.out.println("  4 - Search by color");
        System.out.println("  5 - Add a vehicle");
        System.out.println("  6 - Quit");
        System.out.println("Enter your command: ");
        int command = scanner.nextInt();

        switch (command){
            case 1 -> lis
        }
















    }
}
