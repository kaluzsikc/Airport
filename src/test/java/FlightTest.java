import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    @Before
    public void before() {
        flight = new Flight(PlaneType.AIRBUS319, FlightNumber.A123);
    }

    @Test
    public void hasPlane() {
        assertEquals(PlaneType.AIRBUS319, flight.getPlaneType());
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
