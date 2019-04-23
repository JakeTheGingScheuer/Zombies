import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
