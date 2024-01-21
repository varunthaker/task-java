package org.example.producttype;

public class OptimalProduct implements InsuranceProduct {
    private final int pricePerMeterSquare =700;
    public double calculatedSumInsured(double livingSpace) {
        return pricePerMeterSquare * livingSpace;
    }
}