package Attraction;

import ThemePark.Attractions.Dodgem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgem dodgem;

    @Before
    public void before() {
        dodgem = new Dodgem("Dodgy Dodgems");
    }

    @Test
    public void hasName(){
        assertEquals("Dodgy Dodgems", dodgem.getName());
    }
}
