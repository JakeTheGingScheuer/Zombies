package zombies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SurvivorTest {

    Survivor subject;

    @Before
    public void setUp() throws Exception {
        subject = new Survivor("Karl");
    }

    @Test
    public void whenSurvivorIsCreatedItHas0Wounds() {
        int expected = 0;
        int actual = subject.getWounds();
        assertEquals(expected, actual);
    }

    @Test
    public void whenSurvivorIsCreatedItHasAName() {
        String expected = "Karl";
        String actual = subject.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void whenSurvivorIsCreatedItHasAnInventory() {
        int expected = 5;
        int actual = subject.getInventorySlots();
        assertEquals(expected, actual);
    }
}