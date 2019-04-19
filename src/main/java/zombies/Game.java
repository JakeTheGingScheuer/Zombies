package zombies;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Game {

    private Map<String, Survivor> survivors;
    private Progression.level gameLevel;
    private LinkedHashMap<LocalTime, String> historyLog;

    public Game(){

        this.survivors = new HashMap<>();
        this.gameLevel = Progression.level.BLUE;
        this.historyLog = new LinkedHashMap<>();
        this.historyLog.put(LocalTime.now(), "The Game Has Begun");

    }

    public int getNumberOfSurvivors() {
        return this.survivors.size();
    }

    public Survivor selectSurvivor(String name) {
        return survivors.get(name);
    }


    public void addSurvivor(String survivorName) {

        survivors.put(survivorName, new Survivor(survivorName));
        historyLog.put(LocalTime.now().plusNanos(500), "A survivor was added");
    }

    public boolean isGameOver() {

        if(survivors.isEmpty() ||  getDeathToll() < survivors.size())
            return false;
        else return true;
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

    public Progression.level getLevel() {

        updateLevel();
        return this.gameLevel;

    }

    private void updateLevel(){
        int highestXp = 0;
        for(Survivor survivor: survivors.values()) {
            int thisXp = survivor.getProgression().getCurrentXp();

            if(thisXp > highestXp) {
                highestXp = thisXp;
                this.gameLevel = survivor.getProgression().getCurrentLevel();
            }
        }
    }

    public LocalTime getStartTime() {
        return this.historyLog.entrySet().iterator().next().getKey();
    }

    public Map<LocalTime, String> getHistoryLog() {
        return this.historyLog;
    }


}
