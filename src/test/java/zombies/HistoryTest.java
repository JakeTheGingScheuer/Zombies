package zombies;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class HistoryTest {

    History history;
    LocalTime fakeTime;

    @Before
    public void setUp() {
        fakeTime = LocalTime.now();
        history = new History(fakeTime);
    }

    @Test
    public void whenHistoryIsCreatedItRecordsTheCurrentTime() {
        assertEquals(fakeTime , history.getStartTime());
    }

    @Test
    public void whenLogToHistoryIsCalledAnEventIsPassedToIt() {
        history.logToHistory(Game.event.START);
        assertEquals(Game.event.START, history.getLog().get(0).event);
    }
}
