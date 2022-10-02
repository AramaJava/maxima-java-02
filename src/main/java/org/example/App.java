package org.example;


public class App {
    public static void main(String[] args) {

        City City1 = new City("Сургут", 22022, true, false);
        City City3 = new City("Омск", 302);
/*

        System.out.println("Расстояние до " + City1.getName() + " " + City1.getDistanceKm() + " км" + ", наличие Аэропорта: " + City1.hasAirport() + ", наличие речпорта: " + City1.isOnWater());
        System.out.println("Расстояние до " + City3.getName() + " " + City3.getDistanceKm() + " км" + ", наличие Аэропорта: " + City3.hasAirport() + ", наличие речпорта: " + City3.isOnWater());


        Truck Truck1 = new Truck("ScanIA R-серия 2011", 2000, 200, 2.3f);
        Truck Truck2 = new Truck("Фура дяди Жени", 2100, 80, 12.2f);

        Ship Ship1 = new Ship("Теплоход Василий", 320000, 80, 1.2f);
        Ship Ship2 = new Ship("Теплоход Титаник", 300000, 150, 0.9f);

        Plane Plane1 = new Plane("Boeing 737", 18000, 900, 2f);
        Plane Plane2 = new Plane("Airbus A380", 17000, 950, 1f);

        //Plane1.setRepairing(true);

        System.out.println(Ship1.getName() + " скорость: " + Ship1.getSpeed() + " км/ч" + Ship1.getCapacity());
        System.out.println(Ship2.getName() + " скорость: " + Ship2.getSpeed() + " км/ч" + Ship2.getCapacity());

        System.out.println(Plane1.getName() + " скорость: " + Plane1.getSpeed() + " км/ч" + Plane1.getCapacity());
        System.out.println(Plane2.getName() + " скорость: " + Plane2.getSpeed() + " км/ч" + Plane2.getCapacity());

        System.out.println(Truck1.getName() + " скорость: " + Truck1.getSpeed() + " км/ч" + Truck1.getCapacity());
        System.out.println(Truck2.getName() + " скорость: " + Truck2.getSpeed() + " км/ч" + Truck2.getCapacity());

        System.out.println("Стоимость поездки в город: " + City1.getName() + " транспортом: " + Ship1.getName() + " составит: " + Ship1.getPrice(City1) + " рублей");
        System.out.println("Стоимость поездки в город: " + City1.getName() + " транспортом: " + Plane1.getName() + " составит: " + Plane1.getPrice(City1) + " рублей");
        System.out.println("Стоимость поездки в город: " + City1.getName() + " транспортом: " + Truck1.getName() + " составит: " + Truck1.getPrice(City1) + " рублей");

        System.out.println("Стоимость поездки в город: " + City3.getName() + " транспортом: " + Ship2.getName() + " составит: " + Ship2.getPrice(City3) + " рублей");
        System.out.println("Стоимость поездки в город: " + City3.getName() + " транспортом: " + Plane2.getName() + " составит: " + Plane2.getPrice(City3) + " рублей");
        System.out.println("Стоимость поездки в город: " + City3.getName() + " транспортом: " + Truck2.getName() + " составит: " + Truck2.getPrice(City3) + " рублей");

        Logistics log1 = new Logistics(Truck1, Ship2, Plane1);
        System.out.println("Оптимальный транспорт для города " + City1.getName() + " - " + (log1.getShipping(City1, 200, 2)).getName());

*/


        TransportFactory factory = new TransportFactory();
        Transport newTransport = factory.getTransport(City1, 2230, 2);

        if (newTransport != null) {
            System.out.println(newTransport.getName() + " " + newTransport.getCapacity() + " " + newTransport.getSpeed());

        } else System.out.println("Транспорт не определен!");
    }
}
