package zombies;

import java.util.HashMap;
import java.util.Map;

public class Game {

    private String gameLevel;
    private Map<String, Survivor> survivors;

    public Game(){

        this.survivors = new HashMap<>();
        this.gameLevel = "Blue";
    }

    public int getNumberOfSurvivors() {
        return this.survivors.size();
    }

    public String getLevel() {
        return this.gameLevel;
    }

    public void addSurvivor(String survivorName) {
        survivors.put(survivorName, new Survivor(survivorName));
    }

}
