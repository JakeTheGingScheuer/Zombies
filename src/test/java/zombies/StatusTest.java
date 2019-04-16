package zombies;

import org.junit.Test;

import static org.junit.Assert.*;

public class StatusTest {

    Status status = new Status();

    @Test
    public void whenStatusIsCreatedWoundedIsFalse() {
        assertFalse(status.isWounded());
    }

    @Test
    public void whenAddWoundIsCalledWoundedIsSetToTrue() {
        status.addWound();
        assertTrue(status.isWounded());
    }

    @Test
    public void whenAddWoundIsCalledWhileWoundedIsTrueDeadIsTrue() {
        status.addWound();
        status.addWound();
        assertTrue(status.isDead());
    }

    @Test
    public void whenStatusIsCreatedItHasThreeActionsAvailablePerTurn() {
        int expected = 3;
        int actual =  status.getNumberOfActions();
        assertEquals(expected, actual);
    }
}
