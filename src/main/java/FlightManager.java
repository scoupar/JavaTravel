public class FlightManager {

    private Plane plane;
    private Flight flight;

    public double getWeightAllocatedToBaggage(Plane plane){
        return plane.getWeight() /2;
    }

    public double getPassengerBaggageWeight(Plane plane) {
        return getWeightAllocatedToBaggage(plane) / plane.getCapacity();
    }

    public double getBaggageWeightBooked(Plane plane, Flight flight){
        return getPassengerBaggageWeight(plane) * flight.countPassengers();
    }

    public double calculateRemainingWeight(Plane plane, Flight flight){
        return getWeightAllocatedToBaggage(plane) - getBaggageWeightBooked(plane, flight);
    }

}
