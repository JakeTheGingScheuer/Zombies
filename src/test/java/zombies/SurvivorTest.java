package zombies;

import org.junit.Test;

import static org.junit.Assert.*;

public class SurvivorTest {

    @Test
    public void whenSurvivorIsCreatedItHas0Wounds() {
        Survivor subject = new Survivor("");
        int expected = 0;
        int actual = subject.getWounds();
        assertEquals(expected, actual);
    }

    @Test
    public void whenSurvivorIsCreatedItHasAName() {
        String testName = "KAARRRLLLL";
        Survivor subject = new Survivor(testName);
        String expected = testName;
        String actual = subject.getName();
        assertEquals(expected, actual);
    }
}