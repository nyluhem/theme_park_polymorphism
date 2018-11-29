package ThemePark.Stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCream iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCream("Ice Cold", "Garry Redjeans", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Ice Cold", iceCreamStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Garry Redjeans", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpace(){
        assertEquals(2, iceCreamStall.getParkingSpot());
    }
}
