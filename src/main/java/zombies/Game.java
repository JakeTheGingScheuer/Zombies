package zombies;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Game {

    private Map<String, Survivor> survivors;
    private Progression.level gameLevel;

    public Game(){

        this.survivors = new HashMap<>();
        this.gameLevel = Progression.level.BLUE;

    }

    public int getNumberOfSurvivors() {
        return this.survivors.size();
    }

    public Progression.level getLevel() {

        updateLevel();
        return this.gameLevel;

    }

    public void addSurvivor(String survivorName) {
        survivors.put(survivorName, new Survivor(survivorName));
    }

    public boolean isGameOver() {

        if(survivors.isEmpty() ||  getDeathToll() < survivors.size())
            return false;
        else return true;
    }

    public Survivor selectSurvivor(String name) {
        return survivors.get(name);
    }

    private int getDeathToll() {
        int deathToll = 0;
        for(Survivor survivor: survivors.values()) {
            if(survivor.getStatus().isDead()) {
                deathToll++;
            }
        }
        return deathToll;
    }

    private void updateLevel(){
        int highestXp = 0;
        for(Survivor survivor: survivors.values()) {
            int thisXp = survivor.getProgression().getCurrentXp();

            if(thisXp > highestXp)
                gameLevel = survivor.getProgression().getCurrentLevel();
        }
    }
}
