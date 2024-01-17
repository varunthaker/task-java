package org.example;
import java.util.Scanner;

public class HouseholdInsurance
{

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which product would you like to select?");
        System.out.println("Compact");
        System.out.println("Optimal");

        String productType = scanner.nextLine();

        System.out.println("Please enter the area of your house:");

        double livingSpace = scanner.nextDouble();

        try
        {
            InsuranceProduct product = ProductFactory.createProduct(productType);
            double sumInsured = product.calculatedSumInsured(livingSpace);
            System.out.println("Sum Insured: " + sumInsured);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        } finally
        {
            scanner.close();
        }
    }
}
