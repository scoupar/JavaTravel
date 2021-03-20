import org.junit.Before;
import org.junit.Test;
import sun.tools.tree.BooleanExpression;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Plane plane1;

    @Before
    public void before(){
        flight = new Flight(plane1, 5, "GLA", "JFK", "4PM");
        passenger1 = new Passenger("John Smith", 4);
        passenger2 = new Passenger("Jane Jones", 2);
        plane1 = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void passengerListStartsEmpty(){
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void canAddPassengerToFlight(){
        flight.addPassenger(passenger1, plane1);
        assertEquals(1, flight.countPassengers());
    }

    @Test
    public void canFindAvailableSeats(){
        flight.addPassenger(passenger1, plane1);
        assertEquals(187, flight.getAvailableSeats(plane1));
    }






}
