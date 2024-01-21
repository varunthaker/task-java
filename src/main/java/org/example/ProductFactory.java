package org.example;

public class ProductFactory {
    public static InsuranceProduct createProduct(String productType) throws InsuranceProductException {
        return switch (productType.toLowerCase()) {
            case "compact" -> new CompactProduct();
            case "optimal" -> new OptimalProduct();
            default -> throw new InsuranceProductException("invalid product is entered");
        };
    }
}
