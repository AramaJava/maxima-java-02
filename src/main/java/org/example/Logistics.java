package org.example;
public class Logistics {

  private Transport vehicles[];
 /* private City ShippingCity;

    public City getShippingCity() {
        return ShippingCity;
    }

    public void setShippingCity(City shippingCity) {
        ShippingCity = shippingCity;
    }*/

    public Logistics(Transport ... vehicles) {
        this.vehicles = vehicles;

        for(int i = 0; i < vehicles.length; i++) {
            int index = i + 1;
            System.out.println(" Транспорт " + index + ": " + vehicles[i].getName() + " : " );
        }
    }

    public Transport[] getVehicles() {
        return vehicles;
    }

    public Transport getShipping(City city, int weight, int hours) {


        float Price = vehicles[0].getPrice(city);
        int index = 0;



        for(int i = 0; i < vehicles.length; i++) {

           System.out.println("Tran: " + vehicles[i].getName() + " |$ : " + vehicles[i].getPrice(city) + " |KG: " + vehicles[i].getCapacity() + "|Speed.: "+ vehicles[i].getSpeed());


           if (isShippingAvailable(city,vehicles[i]))  {
           /*    if ((vehicles[i].getPrice(city) <= Price) && (vehicles[i].getCapacity() >= weight) && (vehicles[i].getSpeed() * hours >= city.getDistanceKm())) {
                   Price = (vehicles[i].getPrice(city));
                   index = i;

               }*/

           }
           else  System.out.println("Транспорт не подходит!");
        }
        return index >= 0 ? vehicles[index]: null;
    }

    private Boolean isShippingAvailable(City city, Transport transport) {
        if (city.isOnWater() && (transport instanceof Ship)) {
            return true;}
        if (city.hasAirport() && (transport instanceof Plane)) {
            return true;
        }
        return transport instanceof Truck;
    }


}
