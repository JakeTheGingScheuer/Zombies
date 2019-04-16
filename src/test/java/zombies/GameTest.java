package zombies ;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        Game.gameLevels expected = Game.gameLevels.Blue;
        Game.gameLevels actual = game.getLevel();
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
}
