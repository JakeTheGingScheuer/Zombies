package zombies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game subject;

    @Before
    public void setUp() throws Exception {
        subject = new Game();
    }

    @Test
    public void gameStartsWith0Survivors() {
        int expected = 0;
        int actual = subject.getNumberOfSurvivors();
        assertEquals(expected, actual);
    }
}
