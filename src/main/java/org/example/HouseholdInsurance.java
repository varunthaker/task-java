package org.example;

import org.example.factory.InsuranceProductException;
import org.example.factory.ProductFactory;
import org.example.producttype.InsuranceProduct;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HouseholdInsurance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (scanner) {
            System.out.println("Welche Produkte möchten Sie auswählen? Bitte geben Sie 'Kompakt' oder 'Optimal' ein.");
            String productType = validateAndGetProductType(scanner);
            double livingSpace = validateAndGetLivingSpace(scanner);
            InsuranceProduct product = ProductFactory.createProduct(productType);
            double sumInsured = product.calculatedSumInsured(livingSpace);
            System.out.println("Versicherungssumme: " + sumInsured);
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
                System.out.println("Bitte geben Sie die Wohnfläche in m² an:");
                livingSpace = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Bitte geben Sie einen gültigen Wohnfläche ein. z.B. 25/25.5");
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
        while (!("kompakt".equalsIgnoreCase(productType) || "optimal".equalsIgnoreCase(productType))) {
            System.out.println("Bitte geben Sie entweder 'Kompakt' oder 'Optimal' ein.");
            productType = scanner.nextLine();
        }
        return productType;
    }


}
