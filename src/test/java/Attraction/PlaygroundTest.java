package Attraction;

import ThemePark.Attractions.Playground;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void before() {
        playground = new Playground("PeeWee Playground");
        visitor = new Visitor(14, 185, 200);
    }

    @Test
    public void hasName() {
        assertEquals("PeeWee Playground", playground.getName());
    }

    @Test
    public void canPlayInPlayground () {
        assertEquals(true, playground.isAllowedTo(visitor));
    }
}
