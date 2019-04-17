package zombies ;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Game game = new Game();

    @Test
    public void whenGameIsCreatedItHas0Survivors() {
        int expected = 0;
        int actual = game.getNumberOfSurvivors();
        assertEquals(expected, actual);
    }

    @Test
    public void whenGameIsCreatedItIsAtBlueLevel() {
        Progression.level expected = Progression.level.BLUE;
        Progression.level actual = game.getLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void whenAddSurvivorIsCalledAddsANewSurvivor() {
        game.addSurvivor("fakeSurvivor");
        int expected = 1;
        int actual = game.getNumberOfSurvivors();
        assertEquals(expected, actual);
    }

    @Test
    public void whenAddingNewSurvivorNameMustBeUnique() {
        game.addSurvivor("jake");
        game.addSurvivor("jake");
        int expected = 1;
        int actual = game.getNumberOfSurvivors();
        assertEquals(expected, actual);

    }

    @Test
    public void whenGameIsStartedWithZeroSurvivorsGameOverIsFalse() {
        assertFalse(game.isGameOver());
    }

    @Test
    public void whenSelectSurvivorIsCalledReturnsSurvivor() {

        String expected = "fake";
        game.addSurvivor("fake");
        Survivor fakeSurvivor = game.selectSurvivor("fake");
        assertEquals(expected, fakeSurvivor.getName());

    }

    @Test
    public void whenAllSurvivorsAreDeadGameOverIsTrue() {
        game.addSurvivor("fake");
        Survivor fakeSurvivor = game.selectSurvivor("fake");
        fakeSurvivor.getsHurt();
        fakeSurvivor.getsHurt();
        assertTrue(game.isGameOver());

    }
}
