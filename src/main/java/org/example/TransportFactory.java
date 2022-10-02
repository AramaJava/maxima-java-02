package org.example;

public class TransportFactory {

    final String SHIP_NAME = "Теплоход Светлый";
    final float SHIP_PRICE = 2.32f;
    final String TRUCK_NAME = "Фура";
    final float TRUCK_PRICE = 4.22f;
    final String PLANE_NAME = "Ил-86";
    final float PLANE_PRICE = 5.32f;

    int roundUp(int x, int y) {
        if (x < y) return x;
        if (x % y == 0) {
            return x;
        } else {
            for (int i = 1; i < y; i++) {
                if ((x + i) % y == 0) return x + i;
            }
        }
        return 0;
    }

    public Transport getTransport(City city, int weight, int hours) {
        int getSpeed = city.getDistanceKm() / hours;
        int setSpeed = roundUp(getSpeed,10);
        int setCapacity = roundUp(weight, 500);

        if (getSpeed < 40 && city.isOnWater()) return new Ship(SHIP_NAME, setCapacity, setSpeed, SHIP_PRICE);
        if (getSpeed > 120 && city.hasAirport()) return new Plane(PLANE_NAME, setCapacity, setSpeed, PLANE_PRICE);
        return new Truck(TRUCK_NAME, setCapacity, setSpeed, TRUCK_PRICE);
    }
}

