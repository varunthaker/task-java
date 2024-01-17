package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseholdInsuranceTest {

    @Test
    void testCalculatedSumInsuredCompact()
    {
        var compactInsuranceProduct =new CompactProduct();
       double sumInsured = compactInsuranceProduct.calculatedSumInsured( 100);
       assertEquals(650 * 100, sumInsured);
    }

    @Test
    void testCalculatedSumInsuredOptimal()
    {
        var optimalInsuranceProduct = new OptimalProduct();
        double sumInsured = optimalInsuranceProduct.calculatedSumInsured(150);
        assertEquals(700 * 150, sumInsured);
    }

    @Test
    void testCalculateSumInsuredInvalidProduct()
    {
        var productFactory = new ProductFactory();
        assertThrows(IllegalArgumentException.class, () ->
                productFactory.createProduct("invalidProduct"));
    }

}