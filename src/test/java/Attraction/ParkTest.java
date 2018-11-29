package Attraction;

import ThemePark.Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before() {
        park = new Park("Petersburg Park");
    }

    @Test
    public void hasName() {
        assertEquals("Petersburg Park", park.getName());
    }
}
