package zombies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ProgressionTest {

    Progression progression = new Progression();;

    @Test
    public void whenProgressionIsCreatedItHasZeroXp() {
        int expected = 0;
        int actual = progression.getCurrentXp();
        assertEquals(expected, actual);
    }

    @Test
    public void whenProgressionIsCreatedLevelIsAtBlue() {
        String expected = "Blue";
        String actual = progression.getCurrentLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void whenProgressionIsCreatedSoIsASkillTree() {
        assertNotNull(progression.getSkillTree());
    }
}
