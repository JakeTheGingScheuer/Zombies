package zombies;

import java.time.LocalTime;

public class History {

    LocalTime startTime;

    public History(){
        this.startTime = LocalTime.now();
    }

    public History(LocalTime timeOfGame) {
        this.startTime = timeOfGame;
    }

    public LocalTime getStartTime() {
        return startTime;
    }
}
