import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;


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

        assertTwoWoundsDies();
    }

    private void assertTwoWoundsDies() {
        assertFalse(survivor.isAlive());
        assertEquals(2, survivor.getNumberOfWounds());
    }

    @Test
    public void whenSurvivorIsCreatedItIsAlive () {
        assertTrue(survivor.isAlive());
    }

    @Test
    public void whenASurvivorIsCreatedTheyHaveThreeActionsPerTurn() {
        assertEquals(3, survivor.getNumberOfActionsPerTurn());
    }

    @Test
    public void whenASurvivorIsCreatedItCarriesNoEquipment() {
        assertEquals(0, survivor.getEquipmentInHand().length);
        assertEquals(0, survivor.getReserveEquipment().length);

    }


}
