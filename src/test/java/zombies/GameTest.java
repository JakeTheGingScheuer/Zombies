package zombies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Game subject;

    @Before
    public void setUp() {
        subject = new Game();
    }

    @Test
    public void whenGameStartsThereAreNoSurvivors() {
        int expected = 0;
        int actual = subject.getNumberOfSurvivors();

        assertEquals(expected, actual);
    }

    @Test
    public void whenAddSurvivorIsCalledItAddsANewSurvivor() {
        subject.addSurvivor("fake");
        int expected = 1;
        int actual = subject.getNumberOfSurvivors();
        assertEquals(expected, actual);
    }
}