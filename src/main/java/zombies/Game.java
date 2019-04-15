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
        survivorNames.add(name);
    }
}
