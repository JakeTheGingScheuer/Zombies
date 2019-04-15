package zombies;

import org.junit.Test;

import static org.junit.Assert.*;

public class SurvivorTest {

    @Test
    public void SurvivorStartsWithZeroWoundsAndAName() {
        Survivor Gary = new Survivor("Gary");

        assertFalse(Gary.isWounded());
        assertEquals("Gary", Gary.getName());
    }
}