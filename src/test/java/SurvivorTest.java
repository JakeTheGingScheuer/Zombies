import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class SurvivorTest {

    Survivor survivor = new Survivor("Steve");
    @Test
    public void whenSurvivorIsCreatedItHasAName() {
        assertEquals("Steve", survivor.getName());
    }

    @Test
    public void whenSurvivorIsCreatedItHasNoWounds() {
        int expected = 0;
        int actual = survivor.getNumberOfWounds();

        assertEquals(expected, actual);
    }

    @Test
    public void whenSurvivorReceivesTwoWoundsItDies() {
        survivor.injure();
        survivor.injure();

        assertFalse(survivor.isAlive());

    }
}
