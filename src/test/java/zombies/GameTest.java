package zombies;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class GameTest {

    Game subject;

    @Mock
    Survivor jake;
    @Mock
    Survivor mike;

    @Before
    public void setUp() throws Exception {
        initMocks(this);

        when(jake.getName()).thenReturn("Jake");
        when(mike.getName()).thenReturn("Mike");
        subject = new Game();
    }

    @Test
    public void gameStartsWith0Survivors() {
        int expected = 0;
        int actual = subject.getNumberOfSurvivors();
        assertEquals(expected, actual);
    }

    @Test
    public void gameCanAddSurvivor() throws Exception {
        subject.addSurvivor(jake);

        int expected = 1;
        int actual = subject.getNumberOfSurvivors();
        assertEquals(expected, actual);
    }

    @Test
    public void refusesToAddTheSameName() {
        try{
            subject.addSurvivor(jake);
            subject.addSurvivor(jake);
            fail("expected duplicate name exception");
        } catch (DuplicateNameException e) {
            assertEquals(e.getMessage(), "Jake is taken");
        }
    }

    @Test
    public void errorMessageHasNameOfSurvivor() {
        try{
            subject.addSurvivor(mike);
            subject.addSurvivor(mike);
            fail("expected duplicate name exception");
        } catch (DuplicateNameException e) {
            assertEquals(e.getMessage(), "Mike is taken");
        }
    }
}
