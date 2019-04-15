package zombies;

import org.junit.Test;

import static org.junit.Assert.*;

public class SurvivorTest {

    @Test
    public void SurvivorStartsWithZeroWoundsANameAndThreeActions() {
        Survivor Gary = new Survivor("Gary");

        assertEquals(3, Gary.getActionsPerTurn());
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