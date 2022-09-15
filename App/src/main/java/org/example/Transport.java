package org.example;

public class Transport {
    String name;
    int capacity;
    int speed;
    float costOfKm;



    public float getPrice(City city){
        return city.distanceKm * costOfKm;
    }
}
