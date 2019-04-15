package zombies;

import java.util.HashMap;
import java.util.Map;

public class Game {

    private Map<String, Survivor> survivorList;

    public Game() {
        this.survivorList = new HashMap<>();
    }

    public int getNumberOfSurvivors() {
        return survivorList.size();
    }

    public void addSurvivor(String name) {
        survivorList.put(name, new Survivor(name));
    }

    public void woundSurvivor(String name) {
        survivorList.get(name).getsHurt();

        if (survivorList.get(name).isDead()) {
            survivorList.remove(name);
        }
    }

    public boolean isGameOver() {
        return getNumberOfSurvivors() == 0;
    }
}
