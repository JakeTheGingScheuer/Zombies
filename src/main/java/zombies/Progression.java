package zombies;

public class Progression {

    private int xp;
    private String currentLevel;
    private SkillTree skillTree;

    public Progression(){

        this.xp = 0;
        this.currentLevel = "Blue";
        this.skillTree = new SkillTree();
    }

    public int getCurrentXp() {

        return this.xp;
    }

    public String getCurrentLevel() {

        if(this.xp > 6) this.currentLevel = "Yellow";

        return this.currentLevel;
    }

    public SkillTree getSkillTree() {
        return this.skillTree;
    }

    public void addXp() {
        this.xp++;
    }
}
