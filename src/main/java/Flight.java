import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengerList;
    private Plane plane;
    private int flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;


    public Flight(Plane plane, int flightNumber, String destination, String departureAirport, String departureTime) {
        this.passengerList = new ArrayList<Passenger>();
        this.plane =  plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int countPassengers(){
        return passengerList.size();
    }

    public void addPassenger(Passenger passenger, Plane plane){
        if (this.countPassengers() < plane.getCapacity()) {
            passengerList.add(passenger);
        }

    }

    public int getAvailableSeats(Plane plane){
        return plane.getCapacity() - countPassengers();
    }
}
