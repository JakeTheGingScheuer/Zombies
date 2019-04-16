package zombies;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class SurvivorTest {



    Survivor subject;

    @Before
    public void setUp() {
        subject = new Survivor("Karl");
    }

    @Test
    public void whenSurvivorIsCreatedItIsNotWounded() {
        assertFalse(subject.getStatus().isWounded());
    }

    @Test
    public void whenSurvivorIsCreatedItHasAName() {
        String expected = "KARL";
        String actual = subject.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void whenSurvivorIsCreatedItHasAnInventory() {
        assertNotNull(subject.getInventory());
    }

    @Test
    public void whenSurvivorIsCreatedItHasAProgressionObject() {
        assertNotNull(subject.getProgression());
    }

    @Test
    public void whenSurvivorIsCreatedItHasAStatusObject() {
        assertNotNull(subject.getStatus());
    }

    @Test
    public void whenGetsHurtIsCalledWoundedIsSetToTrue() {
        subject.getsHurt();
        assertTrue(subject.getStatus().isWounded());
    }

    @Test
    public void whenSurvivorIsHurtAndGetsHurtAgainTheyDie() {
        subject.getsHurt();
        subject.getsHurt();
        assertTrue(subject.getStatus().isDead());
    }

    @Test
    public void whenSurvivorIsCreatedItHasThreeActionsAvailablePerTurn() {
        int expected = 3;
        int actual =  subject.getStatus().getNumberOfActions();
        assertEquals(expected, actual);
    }

    @Test
    public void whenSurvivorIsWoundedReserveOnlyHas2Slots() {
        subject.getsHurt();
        int expected = 2;
        int actual = subject.getInventory().getReserveSlots();
        assertEquals(expected, actual);
    }
}