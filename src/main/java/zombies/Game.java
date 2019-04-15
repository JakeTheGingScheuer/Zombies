package zombies;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Survivor> survivorList;

    public Game() {
        this.survivorList = new ArrayList<>();
    }

    public int getNumberOfSurvivors() {
        return survivorList.size();
    }

    public void addSurvivor(String name) {
        if(isAlreadyASurvivor(name)){
            return;
        }
        survivorList.add(new Survivor(name));
    }

    private boolean isAlreadyASurvivor(String name) {
        for(Survivor survivor : survivorList){
            if(survivor.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public void killSurvivor(String name) {
        survivorList.removeIf(survivor -> survivor.getName().equals(name));
    }

    public boolean isGameOver() {
        return getNumberOfSurvivors() == 0;
    }
}
