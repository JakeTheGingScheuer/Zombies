import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SurvivorTest {

    Survivor survivor = new Survivor("Karl");

    @Test
    public void whenSurviorIsCreatedItHasAName() {
        assertEquals("Karl", survivor.getName());
    }

    @Test
    public void whenSurvivorIsCreatedItHasZeroWounds() {
        assertEquals(0, survivor.getNumberOfWounds());
    }

    @Test
    public void whenASurvivorGetsWoundedTwiceTheyAreDead() {
        survivor.getsHurt();
        survivor.getsHurt();
        assertTrue(survivor.isDead());
    }


}
