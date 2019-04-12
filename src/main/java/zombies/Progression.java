package zombies;

public class Progression {

    private int xp;
    private String currentLevel;

    public Progression(){

        this.xp = 0;
        this.currentLevel = "Blue";
    }

    public int getCurrentXp() {

        return this.xp;
    }

    public String getCurrentLevel() {

        return this.currentLevel;
    }
}
