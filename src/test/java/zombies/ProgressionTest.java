package zombies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProgressionTest {

    Progression subject;

    @Before
    public void setUp() throws Exception {
        subject = new Progression();
    }

    @Test
    public void whenProgressionIsCreatedItHasZeroXp() {
        int expected = 0;
        int actual = subject.getCurrentXp();
        assertEquals(expected, actual);
    }
}
