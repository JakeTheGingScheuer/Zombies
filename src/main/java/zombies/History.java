package zombies;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class History {

    LocalTime startTime;
    private List<EventToTrack> log;

    public History(){
        this.startTime = LocalTime.now();
        this.log = new ArrayList<EventToTrack>();
    }

    public History(LocalTime timeOfGame) {

        this.startTime = timeOfGame;
        this.log = new ArrayList<EventToTrack>();
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void logToHistory(Game.event event) {
        log.add(new EventToTrack(event));

    }

    public List<EventToTrack> getLog() {

        return this.log;
    }

    class EventToTrack {
        LocalTime timeOfEvent;
        Game.event event;

        EventToTrack(Game.event event){
            this.timeOfEvent = LocalTime.now();
            this.event = event;
        }
    }
}
