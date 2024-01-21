package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HouseholdInsurance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (scanner) {
            System.out.println("Which product would you like to select? please give input 'Compact' or 'Optimal'.");
            String productType = validateAndGetProductType(scanner);
            double livingSpace = validateAndGetLivingSpace(scanner);
            InsuranceProduct product = ProductFactory.createProduct(productType);
            double sumInsured = product.calculatedSumInsured(livingSpace);
            System.out.println("Sum Insured: " + sumInsured);
        } catch (InsuranceProductException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     *
     * @param scanner {@link Scanner}
     * @return {@link Double}
     */
    private static double validateAndGetLivingSpace(Scanner scanner) {
        double livingSpace = 0.0;
        while (true) {
            try {
                System.out.println("Please enter the area of your house in m2:");
                livingSpace = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Consume the invalid input to avoid an infinite loop
            }
        }
        return livingSpace;
    }

    /**
     *
     * @param scanner {@link Scanner}
     * @return {@link String}
     */
    private static String validateAndGetProductType(Scanner scanner) {
        String productType = scanner.nextLine();
        while (!("compact".equalsIgnoreCase(productType) || "optimal".equalsIgnoreCase(productType))) {
            System.out.println("please enter either 'Compact' or 'Optimal'");
            productType = scanner.nextLine();
        }
        return productType;
    }


}
