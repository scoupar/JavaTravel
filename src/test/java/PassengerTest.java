import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("John Smith", 4);

    }

    @Test
    public void canGetName(){
        assertEquals("John Smith", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(4, passenger.getBags());
    }


}
