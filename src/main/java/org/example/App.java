package org.example;

import java.sql.SQLOutput;

public class App
{
    public static void main( String[] args )
    {
        City City1 = new City("Сургут",1000);
        City City2 = new City("Москва",2000);

        System.out.println("Расстояние до города " + City1.getName() + " " + City1.getDistanceKm() + " км");
        System.out.println("Расстояние до города " + City2.getName() + " " + City2.getDistanceKm() + " км");

        Transport Trasnport1 = new Transport("Автомобиль Аudi 100", 300,250,1.20f);
        Transport Trasnport2 = new Transport("Микроавтобус Mercedes Спринтер",1000,200,2.5f);


        System.out.println(Trasnport1.getName() + " скорость: " + Trasnport1.getSpeed() + " км/ч");
        System.out.println(Trasnport2.getName() + " скорость: " + Trasnport2.getSpeed() + " км/ч");

        System.out.println("Стоимость поездки в город: " + City1.getName() + " транспортом: " + Trasnport1.getName() + " составит: " + Trasnport1.getPrice(City1) + " рублей");
        System.out.println("Стоимость поездки в город: " + City2.getName() + " транспортом: " + Trasnport1.getName() + " составит: " + Trasnport1.getPrice(City2) + " рублей");

        System.out.println("Стоимость поездки в город: " + City1.getName() + " транспортом: " + Trasnport2.getName() + " составит: " + Trasnport2.getPrice(City1) + " рублей");
        System.out.println("Стоимость поездки в город: " + City2.getName() + " транспортом: " + Trasnport2.getName() + " составит: " + Trasnport2.getPrice(City2) + " рублей");

    }
}
