package org.example;

public class CompactProduct implements InsuranceProduct
{
    public double calculatedSumInsured(double livingSpace)
    {
        return 650*livingSpace;
    }
}