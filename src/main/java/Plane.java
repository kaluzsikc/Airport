import java.util.ArrayList;

public class Plane {

    private Airline airline;
    private PlaneType planeType;
    private ArrayList<Passenger> passengers;

    public Plane (Airline airline, PlaneType planeType){

        this.airline = airline;
        this.planeType = planeType;
        this.passengers = new ArrayList<>();
    }


    public Airline getAirline() {
        return airline;
    }

    public PlaneType getType() {
        return planeType;
    }

    public int getNumberOfPassengers() {
        return passengers.size();
    }
}
