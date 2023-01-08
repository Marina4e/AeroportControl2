package org.example;

public class Plane {
    public String flightID;
    public String flightDestination;
    public String [] passengers;

    public Plane (String flightNumbers,int seatAmount){
        flightID = flightNumbers;
        passengers = new String [seatAmount];
    }
    public void setFlightDestination(String destination){
        flightDestination = destination;
    }
    public void boardPassenger(String name,int seatNumber){
        if (seatNumber < passengers.length && passengers[seatNumber] == null) {
            System.out.println
                    ("Boarding done for  " + name + " on flight " + flightID + " to " +flightDestination);
            passengers[seatNumber] = name;
        } else {
            offerFreeSeat(name);}
    }

            public void offerFreeSeat (String name) {
            System.out.println("Failed to find sit for" + name);
            int freeSeat = getFreeSeat();
            if (freeSeat >= 0 && freeSeat < passengers.length) {
                System.out.println("Backup seat found for " + name+ " on flight "+
                        flightID+ " to " + flightDestination);
                passengers[freeSeat] = name;
            } else {
                System.out.println("Flight" + flightID + " had no seats for passenger " + name);
            }
        }

    public int getFreeSeat() {
        int freeSeat = -1;
    for (int i = 0; i < passengers.length; i++) {
        if (passengers[i] == null){
            freeSeat = i;}}
    return freeSeat;}}
