import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before() {

        plane = new Plane(Airline.LUFTHANSA, PlaneType.AIRBUS319);
        flight = new Flight(plane, FlightNumber.A123);
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
}
