import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Plane plane;
    Flight flight;

    @Before
    public void before() {
        airport = new Airport("LTN");
        flight = new Flight(PlaneType.AIRBUS319, FlightNumber.A123);
    }

    @Test
    public void hasCode() {
        assertEquals("LTN", airport.getCode());
    }

    @Test
    public void getNumberOfPlanesInHanger() {
        assertEquals(0, airport.getNumberOfPlanes());
    }

    @Test
    public void addPlanesToHangar(){
        airport.addPlane(plane);
        assertEquals(1, airport.getNumberOfPlanes());
    }

    @Test
    public void removePlanesFromHangar(){
        airport.addPlane(plane);
        airport.addPlane(plane);
        assertEquals(2, airport.getNumberOfPlanes());
        airport.removePlane();
        assertEquals(1, airport.getNumberOfPlanes());
    }

}
