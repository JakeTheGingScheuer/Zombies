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

    @Test
    public void gameLevelIsBlueWithOneSurvivorWithSixXp() {
        game.addSurvivor("fake");
        Survivor fakeSurvivor = game.selectSurvivor("fake");
        multipleKills(fakeSurvivor, 6);
        assertEquals(Progression.level.BLUE, game.getLevel());

    }

    private void multipleKills(Survivor fakeSurvivor, int numberOfKills) {
        for(int i = 0; i < numberOfKills; i++) fakeSurvivor.killZombie();
    }

    @Test
    public void gameLevelIsYellowWithOneSurvivorWithSevenXp() {
        game.addSurvivor("fake");
        Survivor fakeSurvivor = game.selectSurvivor("fake");
        multipleKills(fakeSurvivor, 7);
        assertEquals(Progression.level.YELLOW, game.getLevel());

    }

    @Test
    public void gameLevelIsOrangeWithOneSurvivorWithNineteenXp() {
        game.addSurvivor("fake");
        Survivor fakeSurvivor = game.selectSurvivor("fake");
        multipleKills(fakeSurvivor, 19);
        assertEquals(Progression.level.ORANGE, game.getLevel());

    }

    @Test
    public void gameLevelIsRedWithOneSurvivorWithFourtyThreeXp() {
        game.addSurvivor("fake");
        Survivor fakeSurvivor = game.selectSurvivor("fake");
        multipleKills(fakeSurvivor, 43);
        assertEquals(Progression.level.RED, game.getLevel());

    }

    @Test
    public void gameLevelIsOrangeWithTwoSurvivorsAtYellowAndOrange() {
        game.addSurvivor("fake");
        game.addSurvivor("fake2");
        Survivor fake1 = game.selectSurvivor("fake");
        Survivor fake2 = game.selectSurvivor("fake2");
        multipleKills(fake1, 14);
        multipleKills(fake2, 38);
        assertEquals(Progression.level.ORANGE, game.getLevel());
    }
}
