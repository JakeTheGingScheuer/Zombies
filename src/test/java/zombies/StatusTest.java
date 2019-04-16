package zombies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StatusTest {

    Status subject;

    @Before
    public void setUp() {
        subject = new Status();
    }

    @Test
    public void whenGetsHurtIsCalledWoundedIsSetToTrue() {
        subject.addWound();
        assertTrue(subject.isWounded());
    }

    @Test
    public void whenHurtIsCalledWhileWoundedIsTrueDeadIsTrue() {
        subject.addWound();
        subject.addWound();
        assertTrue(subject.isDead());
    }

    @Test
    public void whenStatusIsCreatedItHasThreeActionsAvailablePerTurn() {
        int expected = 3;
        int actual =  subject.getNumberOfActions();
        assertEquals(expected, actual);
    }
}
