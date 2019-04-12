package zombies;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class GameTest {

    Game subject;

    @Mock
    Survivor survivor;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        subject = new Game();
    }

    @Test
    public void gameStartsWith0Survivors() {
        int expected = 0;
        int actual = subject.getNumberOfSurvivors();
        assertEquals(expected, actual);
    }

    @Test
    public void gameCanAddSurvivor() {
        subject.addSurvivor(survivor);

        int expected = 1;
        int actual = subject.getNumberOfSurvivors();
        assertEquals(expected, actual);
    }
}
