public class Flight {

    private PlaneType planeType;
    private FlightNumber flightNumber;

    public Flight(PlaneType planeType, FlightNumber flightNumber){

        this.planeType = planeType;
        this.flightNumber = flightNumber;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public FlightNumber getFlightNumber() {
        return flightNumber;
    }

    public String getFlightDestination() {
        return flightNumber.getDestination();
    }
}
