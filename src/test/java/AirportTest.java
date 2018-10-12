import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Plane plane;
    Flight flight;
    Passenger passenger;

    @Before
    public void before() {
        airport = new Airport("LTN");
        plane = new Plane(Airline.LUFTHANSA, PlaneType.AIRBUS319);
        flight = new Flight(plane, FlightNumber.A123);
        passenger = new Passenger("Bob");
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

    @Test
    public void canCreateFlights() {
        airport.addFlight(plane, FlightNumber.A123);
        assertEquals( FlightNumber.A123,flight.getFlightNumber());
        assertEquals("LONDON", flight.getFlightDestination());
        assertEquals( PlaneType.AIRBUS319, flight.getPlaneType().getType());
        assertEquals( 5, flight.getPlaneType().getMaxCapacity());
    }

    @Test
    public void canAddPassengersToNewCreateFlights() {
        airport.addFlight(plane, FlightNumber.A123);
        plane.addPassenger(passenger);
        assertEquals( FlightNumber.A123,flight.getFlightNumber());
        assertEquals("LONDON", flight.getFlightDestination());
        assertEquals( PlaneType.AIRBUS319, flight.getPlaneType().getType());
        assertEquals( 5, flight.getPlaneType().getMaxCapacity());
        assertEquals( 1, flight.getPlaneType().getNumberOfPassengers());
    }



}
