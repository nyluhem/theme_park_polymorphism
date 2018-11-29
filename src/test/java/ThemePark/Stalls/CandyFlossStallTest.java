package ThemePark.Stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFloss candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFloss("Curio Floss", "Barry Bluejeans", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Curio Floss", candyFlossStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Barry Bluejeans", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpace(){
        assertEquals(1, candyFlossStall.getParkingSpot());
    }


}
