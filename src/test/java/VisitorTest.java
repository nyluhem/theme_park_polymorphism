import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor(24, 1.85, 150);
    }

    @Test
    public void hasAge () {
        assertEquals(24, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(1.85, visitor.getHeight(), 2);
    }

    @Test
    public void hasMoney() {
        assertEquals(150, visitor.getMoney());
    }
}

