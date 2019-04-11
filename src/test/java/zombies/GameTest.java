package zombies;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class GameTest {

    Game subject;

    @Mock
    Survivor mockSurvivor;

    @Mock
    List<Survivor> mockSurvivors;

    @Before
    public void setUp() {
        initMocks(this);
        mockSurvivors.add(mockSurvivor);
        subject = new Game(mockSurvivors);
    }


    @Test
    public void whenGameIsCreatedItHas0Survivors() {
        int expected = 0;
        int actual = subject.getSurvivors();
        assertEquals(expected, actual);
    }

    @Test
    public void whenGameIsCreatedItIsAtBlueLevel() {
        String expected = "Blue";
        String actual = subject.getLevel();
        assertEquals(expected, actual);
    }
}
