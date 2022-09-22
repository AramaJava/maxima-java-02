package org.example;

public class Truck extends Transport {
    public Truck (String name, int capacity, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
    }
    public float getPrice(City city){
        return city.getDistanceKm() * getCostOfKm();
    }

    @Override
    public float getShipping(int city, int weight, int hours) {
        return 0;
    }
}
