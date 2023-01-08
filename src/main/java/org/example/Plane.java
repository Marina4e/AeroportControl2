public class Plane {
    public String flightID;
    public String flightDestination;
    public String [] passengers;

    public Plane (String flightNumber,int seatAmount){
        flightID = flightNumber;
        passengers = new String [seatAmount];
    }
    public void setFlightDestination(String destination){
        flightDestination = destination;
    }

}
