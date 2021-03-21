import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Passenger passenger;
    Passenger passenger2;
    Plane plane;

    @Before
    public void before(){
        flight = new Flight(plane, 5, "GLA", "JFK", "10AM");
        passenger = new Passenger("John Smith", 4);
        passenger2 = new Passenger("Jane Davidson", 2);
        plane = new Plane(PlaneType.BOEING747);
        flightManager = new FlightManager();
    }

    @Test
    public void canGetWeightAllocatedToBaggage(){
        assertEquals(91750, flightManager.getWeightAllocatedToBaggage(plane), 0.2);
    }

    @Test
    public void canCalculateTotalWeightReservedForEachPassenger(){
        assertEquals(250.68, flightManager.getPassengerBaggageWeight(plane), 0.2);
    }

    @Test
    public void canCalculateTotalWeightBooked(){
        flight.addPassenger(passenger, plane);
        flight.addPassenger(passenger2, plane);
        assertEquals(501.36, flightManager.getBaggageWeightBooked(plane, flight), 0.2);
    }

    @Test
    public void canCalculateRemainingWeight(){
        flight.addPassenger(passenger, plane);
        flight.addPassenger(passenger2, plane);
        assertEquals(91248.64, flightManager.calculateRemainingWeight(plane, flight), 0.2);

    }


}
