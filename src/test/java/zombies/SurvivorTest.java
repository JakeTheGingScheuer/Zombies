package zombies;

import org.junit.Test;

import static org.junit.Assert.*;

public class SurvivorTest {

    @Test
    public void whenSurvivorIsCreatedItHas0Wounds() {
        Survivor subject = new Survivor();
        int expected = 0;
        int actual = subject.getWounds();
        assertEquals(expected, actual);
    }
}