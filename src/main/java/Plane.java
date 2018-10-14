import java.util.ArrayList;

public class Plane {

    private Airline airline;
    private PlaneType planeType;
    private ArrayList<Passenger> passengers;
    private int availableSeats;

    public Plane (Airline airline, PlaneType planeType){

        this.airline = airline;
        this.planeType = planeType;
        this.passengers = new ArrayList<>();
        this.availableSeats = availableSeats;
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

    public int getMaxCapacity() {
        return planeType.getCapacity();
    }

    public int getAvailableSeats() {
         this.availableSeats = planeType.getCapacity() - getNumberOfPassengers();
        return availableSeats;
    }

    public void addPassenger(Passenger passenger) {
        if(this.passengers.size() < this.availableSeats) {
            this.passengers.add(passenger);
            this.availableSeats -=1;
        }
    }

    public void removePassengers() {
        this.passengers.clear();
    }

}
