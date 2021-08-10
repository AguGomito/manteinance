package com.manteinance.demo;

import com.manteinance.demo.model.Car;
import com.manteinance.demo.model.Truck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManteinanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManteinanceApplication.class, args);

        Car vento = new Car("VW", "Vento", "Nafta", "1.810.000", 2012, "102.000", 4);
        Truck mercedes = new Truck("Mercedes-Bez", "1114", "Diesel", "5.000.000", 1998, "1.500.000", true);

        String aImprimir = vento.toString();
        System.out.println(aImprimir);
    }

}
