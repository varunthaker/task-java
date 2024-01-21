package org.example.factory;

import org.example.producttype.CompactProduct;
import org.example.producttype.InsuranceProduct;
import org.example.producttype.OptimalProduct;

public class ProductFactory {
    public static InsuranceProduct createProduct(String productType) throws InsuranceProductException {
        return switch (productType.toLowerCase()) {
            case "kompakt" -> new CompactProduct();
            case "optimal" -> new OptimalProduct();
            default -> throw new InsuranceProductException("ungültiges Produkt eingegeben");
        };
    }
}
