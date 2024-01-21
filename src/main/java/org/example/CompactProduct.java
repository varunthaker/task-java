package org.example;

public class CompactProduct implements InsuranceProduct {
    private final int pricePerMeterSquare = 650;
    public double calculatedSumInsured(double livingSpace) {
        return pricePerMeterSquare * livingSpace;
    }
}