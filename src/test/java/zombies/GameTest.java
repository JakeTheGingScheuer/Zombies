package zombies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void whenGameIsCreatedItHas0Survivors() {
        Game game = new Game();
        int expected = 0;
        int actual = game.getSurvivors();
        assertEquals(expected, actual);
    }

    @Test
    public void whenGameIsCreatedItIsAtBlueLevel() {
        Game game = new Game();
        String expected = "Blue";
        String actual = game.getLevel();
        assertEquals(expected, actual);
    }
}
