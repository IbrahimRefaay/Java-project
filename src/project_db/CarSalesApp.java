/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_db;

import java.util.Scanner;

public class CarSalesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample: List of available cars (for simplicity)
        System.out.println("Available Cars:");
        System.out.println("1. Toyota Camry");
        System.out.println("2. Honda Accord");
        System.out.println("3. Ford Mustang");

        // Get user input for car selection
        System.out.print("\nEnter the number of the car you want to buy: ");
        int selectedCarNumber = scanner.nextInt();

        // Display available customization options
        System.out.println("\nAvailable Customization Options:");
        displayCustomizationOptions(selectedCarNumber);

        // Get user input for customization selection
        System.out.print("\nEnter the number of the customization option you want: ");
        int selectedCustomizationNumber = scanner.nextInt();

        // Calculate and display total cost
        double totalCost = calculateTotalCost(selectedCarNumber, selectedCustomizationNumber);
        System.out.println("\nTotal Cost: $" + totalCost);

        // Simulate user interaction (e.g., asking to proceed with the purchase)
        System.out.print("\nDo you want to proceed with the purchase? (yes/no): ");
        String userResponse = scanner.next();

        if ("yes".equalsIgnoreCase(userResponse)) {
            // Implement the purchase logic here
            System.out.println("Purchase successful! Thank you for buying your car.");
        } else {
            System.out.println("Purchase canceled. Thank you for considering our cars.");
        }

        scanner.close();
    }

    private static void displayCustomizationOptions(int carNumber) {
        // Sample: Display customization options based on car selection
        System.out.println("Customization Options for Selected Car:");

        switch (carNumber) {
            case 1:
                System.out.println("1. Leather Seats - $1500.00");
                System.out.println("2. Sunroof - $1200.00");
                break;
            case 2:
                System.out.println("1. Leather Seats - $1400.00");
                System.out.println("2. Sunroof - $1100.00");
                break;
            case 3:
                System.out.println("1. Leather Seats - $1600.00");
                System.out.println("2. Sunroof - $1300.00");
                break;
            default:
                System.out.println("Invalid car selection.");
        }
    }

    private static double calculateTotalCost(int carNumber, int customizationNumber) {
        // Sample: Calculate total cost based on car and customization selections
        double baseCarPrice = getBaseCarPrice(carNumber);
        double customizationPrice = getCustomizationPrice(carNumber, customizationNumber);

        return baseCarPrice + customizationPrice;
    }

    private static double getBaseCarPrice(int carNumber) {
        // Sample: Retrieve base car price based on car selection
        switch (carNumber) {
            case 1:
                return 25000.00; // Toyota Camry base price
            case 2:
                return 27000.00; // Honda Accord base price
            case 3:
                return 35000.00; // Ford Mustang base price
            default:
                return 0.00; // Invalid car selection
        }
    }

    private static double getCustomizationPrice(int carNumber, int customizationNumber) {
        // Sample: Retrieve customization price based on car and customization selections
        switch (carNumber) {
            case 1:
                return getToyotaCustomizationPrice(customizationNumber);
            case 2:
                return getHondaCustomizationPrice(customizationNumber);
            case 3:
                return getFordCustomizationPrice(customizationNumber);
            default:
                return 0.00; // Invalid car selection
        }
    }

    private static double getToyotaCustomizationPrice(int customizationNumber) {
        // Sample: Retrieve customization price for Toyota based on customization selection
        switch (customizationNumber) {
            case 1:
                return 1500.00; // Leather Seats for Toyota Camry
            case 2:
                return 1200.00; // Sunroof for Toyota Camry
            default:
                return 0.00; // Invalid customization selection
        }
    }

    private static double getHondaCustomizationPrice(int customizationNumber) {
        // Sample: Retrieve customization price for Honda based on customization selection
        switch (customizationNumber) {
            case 1:
                return 1400.00; // Leather Seats for Honda Accord
            case 2:
                return 1100.00; // Sunroof for Honda Accord
            default:
                return 0.00; // Invalid customization selection
        }
    }

    private static double getFordCustomizationPrice(int customizationNumber) {
        // Sample: Retrieve customization price for Ford based on customization selection
        switch (customizationNumber) {
            case 1:
                return 1600.00; // Leather Seats for Ford Mustang
            case 2:
                return 1300.00; // Sunroof for Ford Mustang
            default:
                return 0.00; // Invalid customization selection
        }
    }
}