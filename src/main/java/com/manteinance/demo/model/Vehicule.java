package com.manteinance.demo.model;

public class Vehicule {

    private String brand;
    private String model;
    private String fuel;
    private String buyingPrice;
    private int year;
    private String kms;

    public Vehicule(String brand, String model, String fuel, String buyingPrice, int year, String kms) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.buyingPrice = buyingPrice;
        this.year = year;
        this.kms = kms;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                ", buyingPrice='" + buyingPrice + '\'' +
                ", year=" + year +
                ", kms='" + kms + '\'' +
                '}';
    }
}
