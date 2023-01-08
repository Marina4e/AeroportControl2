package org.example;

public class FlightControl {
    final static int MAX_AIRPORT_CLIENTS = 8;
    public Plane[] planes;
    public String[] passengerNames = new String[MAX_AIRPORT_CLIENTS];
    public int[] passengerSeats = new int[MAX_AIRPORT_CLIENTS];
    public String[] passengerFlights = new String[MAX_AIRPORT_CLIENTS];
    public String[] destinations;
    public FlightControl(Plane[] airportPlanes) {
        planes = airportPlanes;
        destinations = new String[] {"Atlanta","NY"};
    }
    public void setPlaneDestination(String flightID, String destination) {
        Plane plane = getPlaneByFlightID(flightID);
        plane.setFlightDestination(destination);
    }

    public void boardPassenger(int passengerID ) {
        String passengerName = passengerNames[passengerID];
        int passengerSeat = passengerSeats[passengerID];
        String flightID = passengerFlights[passengerID];
        Plane plane = getPlaneByFlightID(flightID);
        plane.boardPassenger(passengerName,passengerSeat);
    }
    public Plane getPlaneByFlightID(String flightID) {
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].flightID.equals(flightID)){
                return planes[i];}
            }
    return null;
    }

    public Plane getAnotherPlaneWithSameDest(String flightID,String dest) {
        for (int i = 0; i < planes.length; i++) {
            if (!planes[i].flightID.equals(flightID) &&
            planes[i].flightDestination.equals(dest)) {
                return planes [i];}
            } return null;}


    public void registerPassenger(int passengerID,String passengerName,
                                   int passengerSeat, String flightID)
    {   passengerNames[passengerID] = passengerName;
        passengerSeats[passengerID] = passengerSeat;
        passengerFlights[passengerID] = flightID;}
}
