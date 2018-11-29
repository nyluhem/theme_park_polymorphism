package ThemePark.Stalls;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    Tobacco tobaccoStall;
    Visitor visitor;

    @Before
    public void before(){
        tobaccoStall = new Tobacco("Puff Puff Bang", "Larry Yellowjeans", 3);
        visitor = new Visitor (19, 190, 3000);
    }

    @Test
    public void hasName(){
        assertEquals("Puff Puff Bang", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Larry Yellowjeans", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpace(){
        assertEquals(3, tobaccoStall.getParkingSpot());
    }

    @Test
    public void only18sAbove () {
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void noUnder18sAllowed() {
        visitor = new Visitor (14, 100, 2);
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
    }
}
