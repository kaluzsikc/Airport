public class Flight {

    private Plane plane;
    private FlightNumber flightNumber;

    public Flight(Plane plane, FlightNumber flightNumber){

        this.plane = plane;
        this.flightNumber = flightNumber;
    }

    public Plane getPlaneType() {
        return plane;
    }

    public FlightNumber getFlightNumber() {
        return flightNumber;
    }

    public String getFlightDestination() {
        return flightNumber.getDestination();
    }
}
