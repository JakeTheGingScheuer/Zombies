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
    public void whenProgressionIsCreatedLevelIsAtBlue(){
        Progression.level expected = Progression.level.BLUE;
        Progression.level actual = progression.getCurrentLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void whenProgressionIsCreatedSoIsASkillTree() {
        assertNotNull(progression.getSkillTree());
    }

    @Test
    public void whenAddXpIsCalledItAddsOneToCurrentXP() {
        progression.addXp();
        assertEquals(progression.getCurrentXp(), 1);
    }
    @Test
    public void whenXpIsAtSevenLevelIsYellow() {
        addMultipleXp(7);
        assertEquals(Progression.level.YELLOW, progression.getCurrentLevel());
    }

    @Test
    public void whenXpIsAtNineteenLevelIsOrange() {
        addMultipleXp(19);
        assertEquals(Progression.level.ORANGE, progression.getCurrentLevel());
    }

    @Test
    public void whenXpIsAtFourtyThreeLevelIsRed() {
        addMultipleXp(43);
        assertEquals(Progression.level.RED, progression.getCurrentLevel());
    }


    private void addMultipleXp(int number) {
        for (int i = 0; i < number; i++){
            progression.addXp();
        }
    }
}
