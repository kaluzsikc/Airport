import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> hangar;
    private String code;

    public Airport(String code) {

        this.hangar = new ArrayList<>();
        this.code = code;
    }


    public String getCode() {
        return code;
    }

    public int getNumberOfPlanes() {
        return hangar.size();
    }

    public void addPlane(Plane plane) {
        this.hangar.add(plane);
    }

    public void removePlane() {
        this.hangar.remove(0);
    }

    public Flight addFlight(Plane plane, FlightNumber flightNumber) {
        Flight newflight = new Flight(plane, flightNumber);
        return newflight;
    }
}
