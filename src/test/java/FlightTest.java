import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void before() {

        plane = new Plane(Airline.LUFTHANSA, PlaneType.AIRBUS319);
        flight = new Flight(plane, FlightNumber.A123);
        passenger = new Passenger("Bob");
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlaneType());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals(FlightNumber.A123, flight.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("LONDON", flight.getFlightDestination());
    }

    @Test
    public void canAddPassengerOnFlight() {
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPlaneType().getNumberOfPassengers());
    }

    @Test
    public void canCountPassengersOnFlight() {
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(5, flight.countPassengers());
    }

    @Test
    public void canRemovePassengersFromFlight() {
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(5, flight.countPassengers());
        flight.removePassengers();
        assertEquals(0, flight.countPassengers());
    }
}
