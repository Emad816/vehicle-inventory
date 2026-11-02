package com.pluralsight;
import java.util.Arrays;
import java.util.Scanner;

public class VehicleInventoryApp {

    static Scanner scanner = new Scanner(System.in);
    static int vehicleCount = 0;
    static Vehicle[] inventory = new Vehicle[20];

    public static void main(String[] args) {

        // preload the 6 vehicles
        inventory[vehicleCount++] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        inventory[vehicleCount++] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        inventory[vehicleCount++] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        inventory[vehicleCount++] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        inventory[vehicleCount++] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        inventory[vehicleCount++] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        boolean running = true;

        while (running) {
            System.out.println("What do you want to do?");
            System.out.println("  1 - List all vehicles");
            System.out.println("  2 - Search by make/model");
            System.out.println("  3 - Search by price range");
            System.out.println("  4 - Search by color");
            System.out.println("  5 - Add a vehicle");
            System.out.println("  6 - Quit");
            System.out.println("Enter your command: ");
            int command = scanner.nextInt();
            scanner.nextLine(); //clears left over

            switch (command) {
                case 1 -> listAllVehicles();
                case 2 -> findVehiclesByMakeModel();
                case 3 -> addVehicle();
                case 6 -> running = false;
                default -> System.out.println("Invalid command, try again.");
            }
        }
        System.out.println("Good bye!");

    }

    public static void listAllVehicles() {
        for(int i =0; i < vehicleCount; i++ ) {
            System.out.println(inventory[i]);
        }
    }

    public static void findVehiclesByMakeModel() {
        System.out.print("Enter make/model: ");
        String search = scanner.nextLine().trim().toLowerCase();

        boolean found = false;
        for (int i = 0; i < vehicleCount; i++) {
            if (inventory[i].getMakeModel().toLowerCase().contains(search)) {
                System.out.println(inventory[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles found.");
        }
    }

    public static void addVehicle() {
        if (vehicleCount >= inventory.length) {
            System.out.println("Inventory is full.");
            return;
        }

        System.out.print("Vehicle ID: ");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Make/model: ");
        String makeModel = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Odometer reading: ");
        int odometer = scanner.nextInt();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        inventory[vehicleCount++] = new Vehicle(id, makeModel, color, odometer, price);
        System.out.println("Vehicle added.");
    }
}
