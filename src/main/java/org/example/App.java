package org.example;

import java.sql.SQLOutput;

public class App
{
    public static void main( String[] args )
    {
        City City1 = new City("Сургут",1000, true, false);
        City City3 = new City("Омск",1700);

        System.out.println("Расстояние до " + City1.getName() + " " + City1.getDistanceKm() + " км"+ ", наличие Аэропорта: " + City1.hasAirport() + ", наличие речпорта: " + City1.isOnWater());
        System.out.println("Расстояние до " + City3.getName() + " " + City3.getDistanceKm() + " км"+ ", наличие Аэропорта: " + City3.hasAirport() + ", наличие речпорта: " + City3.isOnWater());


        Truck Truck1 = new Truck("Scania R-серия 2011",2000,90,12.3f);
        Truck Truck2 = new Truck("Фура дяди Жени",2100,80,12.2f);

        Ship Ship1 = new Ship("Теплоход Василий",320000,80,1.2f);
        Ship Ship2 = new Ship("Теплоход Титаник",1520000,150,10.9f);

        Plane Plane1 = new Plane("Boeing 737",18000, 900, 40.3f);
        Plane Plane2 = new Plane("Airbus A380", 17000,  950, 39.3f);


        System.out.println(Ship1.getName() + " скорость: " + Ship1.getSpeed() + " км/ч");
        System.out.println(Ship2.getName() + " скорость: " + Ship2.getSpeed() + " км/ч");

        System.out.println(Plane1.getName() + " скорость: " + Plane1.getSpeed() + " км/ч");
        System.out.println(Plane2.getName() + " скорость: " + Plane2.getSpeed() + " км/ч");

        System.out.println(Truck1.getName() + " скорость: " + Truck1.getSpeed() + " км/ч");
        System.out.println(Truck2.getName() + " скорость: " + Truck2.getSpeed() + " км/ч");

        System.out.println("Стоимость поездки в город: " + City1.getName() + " транспортом: " + Ship1.getName() + " составит: " + Ship1.getPrice(City1) + " рублей");
        System.out.println("Стоимость поездки в город: " + City1.getName() + " транспортом: " + Plane1.getName() + " составит: " + Plane1.getPrice(City1) + " рублей");
        System.out.println("Стоимость поездки в город: " + City1.getName() + " транспортом: " + Truck1.getName() + " составит: " + Truck1.getPrice(City1) + " рублей");

        System.out.println("Стоимость поездки в город: " + City3.getName() + " транспортом: " + Ship2.getName() + " составит: " + Ship2.getPrice(City3) + " рублей");
        System.out.println("Стоимость поездки в город: " + City3.getName() + " транспортом: " + Plane2.getName() + " составит: " + Plane2.getPrice(City3) + " рублей");
        System.out.println("Стоимость поездки в город: " + City3.getName() + " транспортом: " + Truck2.getName() + " составит: " + Truck2.getPrice(City3) + " рублей");

        Logistics log1 = new Logistics(Truck1,Ship2, Plane1);
    }
}
