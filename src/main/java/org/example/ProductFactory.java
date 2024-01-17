package org.example;

public class ProductFactory
{
    public static InsuranceProduct createProduct (String productType) {
        switch (productType.toLowerCase()) {
            case "compact":
                return new CompactProduct();
            case "optimal":
                return new OptimalProduct();
            default:
                throw new IllegalArgumentException("Invalid product type");
        }
    }
}
