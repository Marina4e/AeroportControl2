package org.example;

public class Main {
    public static void main(String[] args) {
        Plane[] airportPlanes = new Plane[3];
        airportPlanes[0] = new Plane("Flight001", 2);
        airportPlanes[1] = new Plane("Flight002", 3);
        airportPlanes[2] = new Plane("Flight003", 2);
        FlightControl airport = new FlightControl(airportPlanes);
        airport.setPlaneDestination("Flight001","Atlanta");
        airport.setPlaneDestination("Flight002","NY");
        airport.setPlaneDestination("Flight003","NY");
        createPassengers(airport);
        for (int i = 0; i < airport.passengerNames.length; i++) {
            airport.boardPassenger(i);
            
        }
    }
    public static void createPassengers(FlightControl airport){
    airport.registerPassenger(0,"Alice",0,"Flight001");
    airport.registerPassenger(1,"Bob",1,"Flight001");

    airport.registerPassenger(2,"Joe",0,"Flight002");
    airport.registerPassenger(3,"Jane",1,"Flight002");
    airport.registerPassenger(4,"Alice",2,"Flight002");

    airport.registerPassenger(5,"Sarah",0,"Flight003");
    airport.registerPassenger(6,"Arnie",1,"Flight003");
    airport.registerPassenger(7,"Kile",2,"Flight003");
    }
}