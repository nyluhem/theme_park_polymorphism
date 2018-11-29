package Attraction;

import ThemePark.Attractions.Rollercoaster;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("Roaring Rollercoaster");
        visitor = new Visitor (14, 146, 200);
    }

    @Test
    public void hasName(){
        assertEquals("Roaring Rollercoaster", rollercoaster.getName());
    }

    @Test
    public void isAllowedToRide(){

        assertEquals(true, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void isNotAllowedToRide() {
        visitor = new Visitor(12, 140, 180);
        assertEquals(false, rollercoaster.isAllowedTo(visitor));
    }
}
