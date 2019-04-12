package zombies ;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class GameTest {

    Game subject;

    @Mock
    Survivor mockSurvivor;


    @Before
    public void setUp() {
        initMocks(this);
        subject = new Game();
    }


    @Test
    public void whenGameIsCreatedItHas0Survivors() {
        int expected = 0;
        int actual = subject.getNumberOfSurvivors();
        assertEquals(expected, actual);
    }

    @Test
    public void whenGameIsCreatedItIsAtBlueLevel() {
        String expected = "Blue";
        String actual = subject.getLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void whenAddSurvivorIsCalledAddsANewSurvivor() {
        subject.addSurvivor(mockSurvivor);
        int expected = 1;
        int actual = subject.getNumberOfSurvivors();
        assertEquals(expected, actual);
    }
}
