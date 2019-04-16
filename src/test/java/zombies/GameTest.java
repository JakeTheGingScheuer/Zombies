package zombies ;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GameTest {

    Game subject;

    @Before
    public void setUp() {
        subject = new Game();
    }


    @Test
    public void whenGameIsCreatedItHas0Survivors() {
        int expected = 0;
        int actual = subject.getNumberOfSurvivors();
        assertEquals(expected, actual);
    }

    @Test
    public void whenGameIsCreatedItIsAtBlueLevel() {
        Game.gameLevels expected = Game.gameLevels.Blue;
        Game.gameLevels actual = subject.getLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void whenAddSurvivorIsCalledAddsANewSurvivor() {
        subject.addSurvivor("fakeSurvivor");
        int expected = 1;
        int actual = subject.getNumberOfSurvivors();
        assertEquals(expected, actual);
    }

    @Test
    public void whenAddingNewSurvivorNameMustBeUnique() {
        subject.addSurvivor("jake");
        subject.addSurvivor("jake");
        int expected = 1;
        int actual = subject.getNumberOfSurvivors();
        assertEquals(expected, actual);

    }
}
