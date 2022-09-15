package org.example;

import java.sql.SQLOutput;

public class App
{
    public static void main( String[] args )
    {
        City City1 = new City();
        City City2 = new City();
        City1.name = "Сургут";
        City1.distanceKm = 1000;
        City2.name = "Москва";
        City2.distanceKm = 2000;

        System.out.println(City1.name + " " + City1.distanceKm);
        System.out.println(City2.name + " " + City2.distanceKm);

        Transport Trasnport1 = new Transport();
        Transport Trasnport2 = new Transport();
        Trasnport1.name = "Автомобиль Аudi 100";
        Trasnport1.speed = 200;
        Trasnport1.costOfKm = 1.20F;

        Trasnport2.name = "Микроавтобус Mercedes Спринтер";
        Trasnport2.speed = 180;
        Trasnport2.costOfKm = 2.20F;

        System.out.println(Trasnport1.name + " скорость:" + Trasnport1.speed + " км/ч");
        System.out.println(Trasnport2.name + " скорость:" + Trasnport2.speed + " км/ч");

        System.out.println(Trasnport1.getPrice(City2));
        System.out.println(Trasnport2.getPrice(City2));
    }
}
