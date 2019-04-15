package zombies;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void whenGameStartsThereAreNoSurvivors() {
        Game game = new Game();
        int expected = 0;
        int actual = game.getNumberOfSurvivors();

        assertEquals(expected, actual);
    }
}