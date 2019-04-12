package zombies;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private String gameLevel;
    private List<Survivor> survivors;

    public Game(){
        this.survivors = new ArrayList<Survivor>();
        this.gameLevel = "Blue";
    }

    public int getNumberOfSurvivors() {
        return this.survivors.size();
    }

    public String getLevel() {
        return this.gameLevel;
    }

    public void addSurvivor(Survivor survivor) {
        this.survivors.add(survivor);
    }
}
