import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Plane plane2;
    Passenger passenger;


    @Before
    public void before() {
        plane1 = new Plane(Airline.LUFTHANSA, PlaneType.AIRBUS319);
        plane2 = new Plane(Airline.LUFTHANSA, PlaneType.AIRBUS320);
        passenger = new Passenger("Bob");
    }

    @Test
    public void hasAirline() {
        assertEquals(Airline.LUFTHANSA, plane1.getAirline());
    }

    @Test
    public void hasType() {
        assertEquals(PlaneType.AIRBUS319, plane1.getType());
    }

    @Test
    public void hasNoPassengers() {
        assertEquals(0, plane1.getNumberOfPassengers());
    }

    @Test
    public void maxCapacity() {
        assertEquals(5, plane1.getMaxCapacity());
        assertEquals(10, plane2.getMaxCapacity());
    }

    @Test
    public void canAddPassengers() {
        plane1.addPassenger(passenger);
        plane1.addPassenger(passenger);
        plane1.addPassenger(passenger);
        plane1.addPassenger(passenger);
        plane1.addPassenger(passenger);
        assertEquals(5, plane1.getNumberOfPassengers());
    }

    @Test
    public void canNotAddPassengersIfAboveCapacity() {
        plane1.addPassenger(passenger);
        plane1.addPassenger(passenger);
        plane1.addPassenger(passenger);
        plane1.addPassenger(passenger);
        plane1.addPassenger(passenger);
        plane1.addPassenger(passenger);
        plane1.addPassenger(passenger);
        assertEquals(5, plane1.getNumberOfPassengers());
    }

    @Test
    public void canRemovePassengers() {
        plane1.addPassenger(passenger);
        plane1.addPassenger(passenger);
        plane1.addPassenger(passenger);
        plane1.addPassenger(passenger);
        plane1.addPassenger(passenger);
        assertEquals(5, plane1.getNumberOfPassengers());

        plane1.removePassengers();
        assertEquals(0, plane1.getNumberOfPassengers());
    }

}
