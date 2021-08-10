package com.manteinance.demo.model;

public class Truck extends Vehicule {

    private boolean dual;

    public Truck(String brand, String model, String fuel, String buyingPrice, int year, String kms, boolean dual) {
        super(brand, model, fuel, buyingPrice, year, kms);
        this.dual = dual;
    }
}
