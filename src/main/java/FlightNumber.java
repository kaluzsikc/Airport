public enum FlightNumber {

    A123("LONDON"),
    B123("SEYCHELLES"),
    C123("BARCELONA"),
    D123("DUBAI"),
    E123("LISBON");

    private final String destination;

    FlightNumber(String destination){
        this.destination = destination;
    }

    public String getDestination(){
        return destination;
    }


}
