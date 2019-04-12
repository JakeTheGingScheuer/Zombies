package zombies;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class SurvivorTest {

    Survivor subject;

    @Mock
    Inventory mockInventory;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        subject = new Survivor("Karl", mockInventory);
    }

    @Test
    public void whenSurvivorIsCreatedItHas0Wounds() {
        int expected = 0;
        int actual = subject.getWounds();
        assertEquals(expected, actual);
    }

    @Test
    public void whenSurvivorIsCreatedItHasAName() {
        String expected = "Karl";
        String actual = subject.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void whenSurvivorIsCreatedItHasAnInventory() {
        assertNotNull(subject.getInventory());
    }
}