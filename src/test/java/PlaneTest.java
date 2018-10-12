import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(Airline.LUFTHANSA, PlaneType.AIRBUS319);
    }

    @Test
    public void hasAirline() {
        assertEquals(Airline.LUFTHANSA, plane.getAirline());
    }

    @Test
    public void hasType() {
        assertEquals(PlaneType.AIRBUS319, plane.getType());
    }

    @Test
    public void hasNoPassengers() {
        assertEquals(0, plane.getNumberOfPassengers());
    }
}
