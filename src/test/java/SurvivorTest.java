import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SurvivorTest {

    @Test
    public void whenSurvivorIsCreatedItHasAName() {
        Survivor survivor = new Survivor("Steve");
        assertEquals("Steve", survivor.getName());
    }
}
