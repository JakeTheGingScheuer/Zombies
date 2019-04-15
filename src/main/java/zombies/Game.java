package zombies;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private String gameLevel;
    private List<Survivor> survivors;

    public Game(){

        this.survivors = new ArrayList<>();
        this.gameLevel = "Blue";
    }

    public int getNumberOfSurvivors() {
        return this.survivors.size();
    }

    public String getLevel() {
        return this.gameLevel;
    }

    public void addSurvivor(String survivorName) {
        if(!survivors.contains(survivorName.toUpperCase())){
            this.survivors.add(new Survivor(survivorName));
        }
    }

}
