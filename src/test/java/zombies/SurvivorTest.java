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

    @Test
    public void whenSurvivorGetsHurtTheyAreWounded() {
        Survivor Gary = new Survivor("Gary");

        Gary.getsHurt();

        assertTrue(Gary.isWounded());
    }

    @Test
    public void whenWoundedSurvivorGetsHurtAgainTheyDie() {
        Survivor Gary = new Survivor("Gary");

        Gary.getsHurt();
        Gary.getsHurt();

        assertTrue(Gary.isDead());
    }

}