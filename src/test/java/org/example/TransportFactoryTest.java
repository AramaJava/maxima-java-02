package org.example;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class TransportFactoryTest
{
    private Transport transport1, transport1a, transport2, transport2a, transport3, transport3a, transport4, transport4a, transport5;

 /* Описать класс TransportFactory
    с методом Transport getTransport(City city, int weight, int hours)
    который будет в зависимости от города, веса и срока доставки конструировать
    нам транспортное средство по следующим правилам:

    Тесты 1 гр.: Если скорость, необходимая для выполнения заказа до 40 км/ч и город на воде, то корабль.

    Тесты 2 гр.: Если нужна скорость выше 120 км/ч, и есть аэропорт, то самолет.

    Тесты 3 гр.: В остальных случаях — грузовик.

    Тесты 4 гр.: Грузоподъемность должна равняться весу груза, округленного вверх до числа кратного 500.

    Тесты 5 гр.: Скорость должна равняться скорости, необходимой для прибытия в срок, округленной вверх до ближайшего десятка.

    */


    @Before
    public void Prepare(){
        City city1 = new City("Сургут", 400, true,  true);
        City city2 = new City("Сартым", 400, false, false);
        City city3 = new City("Ростов", 3500, true, true);

        transport1 = TransportFactory.getTransport(city1, 5000, 20);
        transport1a = TransportFactory.getTransport(city2, 5000, 20);

        transport2 = TransportFactory.getTransport(city1, 5000, 2);
        transport2a = TransportFactory.getTransport(city2, 5000, 2);

        transport3 = TransportFactory.getTransport(city1, 5000, 5);
        transport3a = TransportFactory.getTransport(city2, 5000, 5);

        transport4 = TransportFactory.getTransport(city1, 2600, 100);
        transport4a = TransportFactory.getTransport(city1, 500, 100);

        transport5 = TransportFactory.getTransport(city3, 5000, 20);


    }
    // Тесты 1 гр.
    @Test
    public void shouldBeShip(){
        assertEquals(transport1.getClass(), Ship.class);
        System.out.printf("Скорость транспорта %s %s равна: %s", transport1.getClass().getName(), transport1.getName(), transport1.getSpeed());
    }

    @Test
    public void shouldNotBeShip(){
        assertEquals(transport1a.getClass(), Truck.class);
        System.out.printf("Скорость транспорта %s %s равна: %s", transport1a.getClass().getName(), transport1a.getName(), transport1a.getSpeed());
    }

    // Тесты 2 гр.
    @Test
    public void shouldBePlane() {
        assertEquals(transport2.getClass(), Plane.class);
        System.out.printf("Скорость транспорта %s %s равна: %s", transport2.getClass().getName(), transport2.getName(), transport2.getSpeed());
    }

    @Test
    public void shouldNotBePlane() {
        assertNotEquals(transport2a.getClass(), Plane.class);
        System.out.printf("Скорость транспорта %s %s равна: %s", transport2a.getClass().getName(), transport2a.getName(), transport2a.getSpeed());
    }
    // // Тесты 3 гр.
    @Test
    public void shouldBeTruck() {
        assertEquals(transport3.getClass(), Truck.class);
        System.out.printf("Скорость транспорта %s %s равна: %s", transport3.getClass().getName(), transport3.getName(), transport3.getSpeed());
    }
    @Test
    public void shouldBeTruckAndCityNoAirport() {
        assertEquals(transport3a.getClass(), Truck.class);
        System.out.printf("Скорость транспорта %s %s равна: %s", transport3a.getClass().getName(), transport3a.getName(), transport3a.getSpeed());
    }
    // Тесты 4 гр.
    @Test
    public void shouldRoundCapacity(){
        assertEquals(3000, transport4.getCapacity());
        System.out.printf("Грузоподьемность транспорта %s %s равна: %s", transport3a.getClass().getName(), transport3a.getName(), transport4.getCapacity());

    }
    @Test
    public void shouldNotRoundCapacity(){
        assertNotEquals(700, transport4a.getCapacity());
    }
    // Тесты 5 гр.
    @Test
    public void shouldRoundSpeed(){
       assertEquals(180, transport5.getSpeed());
    }

    @Test
    public void shouldNotRoundSpeed(){
        assertEquals(20, transport1.getSpeed());
    }

}
