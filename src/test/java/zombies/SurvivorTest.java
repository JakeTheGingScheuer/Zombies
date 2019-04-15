package zombies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SurvivorTest {

    Survivor Gary;

    @Before
    public void setUp() {
       Gary = new Survivor("Gary");
    }

    @Test
    public void survivorStartsWithZeroWoundsANameAndThreeActions() {

        assertEquals(3, Gary.getActionsPerTurn());
        assertFalse(Gary.isWounded());
        assertEquals("Gary", Gary.getName());
    }

    @Test
    public void whenSurvivorGetsHurtTheyAreWounded() {

        Gary.getsHurt();

        assertTrue(Gary.isWounded());
    }

    @Test
    public void whenWoundedSurvivorGetsHurtAgainTheyDie() {

        Gary.getsHurt();
        Gary.getsHurt();

        assertTrue(Gary.isDead());
    }

    @Test
    public void whenSurvivorIsCreatedTheyHaveFiveEquipmentSlots() {

        assertEquals(5, Gary.getInventorySlots());

    }

    @Test
    public void whenSurvivorIsWoundedTheyHaveFourEquipmentSlots() {
        Gary.getsHurt();

        assertEquals(4, Gary.getInventorySlots());
    }

    @Test
    public void survivorHasTwoOnHandEquipmentSlots() {
        assertEquals(2, Gary.countHands());
    }

    @Test
    public void survivorStartsWithZeroExperienceAndBlueLevel() {
        assertEquals(0, Gary.getCurrentXP());
        assertEquals("Blue", Gary.getCurrentLevel());
    }

    @Test
    public void garyHasAThirstForBlood() {

        Gary.kill();
        assertEquals(1, Gary.getCurrentXP());
    }

    @Test
    public void garyStillHasNotSlakedHisThirstForBlood() {
        for (int i = 0; i < 7; i++){
            Gary.kill();
        }
        assertEquals("Yellow", Gary.getCurrentLevel());
    }

    @Test
    public void noOneCanStopTheGary() {
        for (int i = 0; i < 19; i++){
            Gary.kill();
        }
        assertEquals("Orange", Gary.getCurrentLevel());
    }

    @Test
    public void garysThirstIsAsMightyAsHisZombieKillingHands() {
        for (int i = 0; i < 43; i++){
            Gary.kill();
        }
        assertEquals("Red", Gary.getCurrentLevel());
    }

}
