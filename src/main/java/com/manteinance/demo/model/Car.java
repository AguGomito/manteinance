package com.manteinance.demo.model;

public class Car extends Vehicule {

    private int door;

    public Car(String brand, String model, String fuel, String buyingPrice, int year, String kms, int door) {
        super(brand, model, fuel, buyingPrice, year, kms);
        this.door = door;
    }

    @Override
    public String toString() {
        String padre = super.toString();
        String hijo = "Car{ door= " + this.door + " }";
        return padre + hijo;
    }
}
