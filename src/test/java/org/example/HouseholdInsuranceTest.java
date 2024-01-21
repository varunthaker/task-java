package org.example;

import org.example.producttype.CompactProduct;
import org.example.producttype.OptimalProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HouseholdInsuranceTest {

    @Test
    void compactProduct100_calculate_65000() {
        assertEquals(65000, new CompactProduct().calculatedSumInsured(100), 0.0);
    }

    @Test
    void optimalProduct100_calculate_70000() {
       assertEquals(70000, new OptimalProduct().calculatedSumInsured(100), 0.0);
    }

}