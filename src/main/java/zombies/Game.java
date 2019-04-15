package zombies;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<String> survivorNames;

    public Game() {
        this.survivorNames = new ArrayList<>();
    }

    public int getNumberOfSurvivors() {
        return survivorNames.size();
    }

    public void addSurvivor(String name) {
        if(survivorNames.contains(name)){
            return;
        }
        survivorNames.add(name);
    }

    public void killSurvivor(String survivorName) {
        survivorNames.remove(survivorName);
    }

    public boolean isGameOver() {
        return getNumberOfSurvivors() == 0;
    }
}
