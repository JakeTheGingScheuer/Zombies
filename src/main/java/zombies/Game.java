package zombies;

import java.util.HashMap;
import java.util.Map;

public class Game {

    enum gameLevels {Blue, Yellow, Orange, Red};

    private gameLevels gameLevel;
    private Map<String, Survivor> survivors;

    public Game(){

        this.survivors = new HashMap<>();
        this.gameLevel = gameLevels.Blue;
    }

    public int getNumberOfSurvivors() {
        return this.survivors.size();
    }

    public gameLevels getLevel() {
        return this.gameLevel;
    }

    public void addSurvivor(String survivorName) {
        survivors.put(survivorName, new Survivor(survivorName));
    }

}
