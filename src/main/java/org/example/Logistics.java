package org.example;

public class Logistics {
    public Logistics(Transport ... vehicles) {
        System.out.println("Число аргументов: " + vehicles.length);
        System.out.println("Содержимое: ");

        for(int i = 0; i < vehicles.length; i++) {
            int index = i + 1;
            System.out.println(" Транспорт " + index + ": " + vehicles[i].getName() + " : " + vehicles[i].getShipping(1,200,5));
        }
        System.out.println();
    }

}
