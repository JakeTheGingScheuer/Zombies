package zombies;

public class Game {
    private int numberOfSurvivors;

    public Game() {
        this.numberOfSurvivors = 0;
    }

    public int getNumberOfSurvivors() {
        return this.numberOfSurvivors;
    }

    public void addSurvivor(Survivor survivor) {
        numberOfSurvivors++;
    }
}
