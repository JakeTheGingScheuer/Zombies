package zombies;

import java.util.List;

public class Game {

    private String gameLevel;
    private List<Survivor> survivors;

    public Game(List<Survivor> survivors){
        this.survivors = survivors;
        this.gameLevel = "Blue";
    }

    public int getSurvivors() {
        return this.survivors.size();
    }

    public String getLevel() {
        return this.gameLevel;
    }
}
