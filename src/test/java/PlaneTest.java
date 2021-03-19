import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void canGetTypeCapacityAndWeight(){
        assertEquals(PlaneType.BOEING737, plane.getType());
        assertEquals(188, plane.getCapacity());
        assertEquals(41145, plane.getWeight());

    }
}
