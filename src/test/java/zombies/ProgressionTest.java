package zombies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ProgressionTest {

    Progression subject;

    @Before
    public void setUp() {
        subject = new Progression();
    }

    @Test
    public void whenProgressionIsCreatedItHasZeroXp() {
        int expected = 0;
        int actual = subject.getCurrentXp();
        assertEquals(expected, actual);
    }

    @Test
    public void whenProgressionIsCreatedLevelIsAtBlue() {
        String expected = "Blue";
        String actual = subject.getCurrentLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void whenProgressionIsCreatedSoIsASkillTree() {
        assertNotNull(subject.getSkillTree());
    }
}
