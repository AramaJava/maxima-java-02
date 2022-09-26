


package org.example;



public class Logistics {

    private final Transport[] vehicles;


    public Logistics(Transport... vehicles) {
        this.vehicles = vehicles;


        for (int i = 0; i < vehicles.length; i++) {
            int index = i + 1;
            System.out.println(" Транспорт " + index + ": " + vehicles[i].getName() + " : ");
        }
    }

    private boolean isShippingAvailable(City city, Transport transport) {
        if (transport instanceof Ship & city.isOnWater()) {return true;}
        if (transport instanceof Plane & city.hasAirport()) {return true;}
        if (transport instanceof Truck) return true;
        return false;
    }


    public Transport getShipping(City city, int weight, int hours) {

        Transport [] SortVehicles = new Transport[vehicles.length];

        for (int i = 0; i < vehicles.length; i++) {
            Transport currentTransport = vehicles[i];
            if (isShippingAvailable(city, currentTransport)) {
               if (!currentTransport.isRepairing()) {
                if (city.getDistanceKm() < currentTransport.getSpeed() * hours) {
                    if (currentTransport.getCapacity() >= weight) {
                        SortVehicles[i]= currentTransport;
                    }
                }
             }
            }
        }

        float startPrice = SortVehicles[0].getCostOfKm();
        Transport optimalTransport = SortVehicles[0];

        for (Transport sortVehicle : SortVehicles) {
            if (sortVehicle != null) {
                float curPrice = sortVehicle.getCostOfKm();
                if (curPrice < startPrice) {
                    startPrice = curPrice;
                    optimalTransport = sortVehicle;
                }
            }

        }
        return optimalTransport;
    }
}