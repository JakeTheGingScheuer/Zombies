import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SurvivorTest {

    Survivor survivor;

    @Test
    public void whenSurviorIsCreatedItHasAName() {
        survivor = new Survivor("Karl");
        assertEquals(survivor.getName(), "Karl");
    }
}
