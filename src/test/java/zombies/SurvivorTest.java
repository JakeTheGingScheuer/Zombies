package zombies;

import org.junit.Test;

import static org.junit.Assert.*;

public class SurvivorTest {

    Survivor survivor = new Survivor("Karl");

    @Test
    public void whenSurvivorIsCreatedItHasAName() {
        String expected = "KARL";
        String actual = survivor.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void whenSurvivorIsCreatedItHasAnInventory() {
        assertNotNull(survivor.getInventory());
    }

    @Test
    public void whenSurvivorIsCreatedItHasAProgressionObject() {
        assertNotNull(survivor.getProgression());
    }

    @Test
    public void whenSurvivorIsCreatedItHasAStatusObject() {
        assertNotNull(survivor.getStatus());
    }


    @Test
    public void whenSurvivorIsWoundedReserveOnlyHas2Slots() {
        survivor.getsHurt();
        int expected = 2;
        int actual = survivor.getInventory().getReserveSlots();
        assertEquals(expected, actual);
    }
}