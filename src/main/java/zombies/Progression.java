package zombies;

public class Progression {

    enum level {BLUE, YELLOW, ORANGE, RED}

    private int xp;
    private level currentLevel;
    private SkillTree skillTree;

    public Progression(){

        this.xp = 0;
        this.currentLevel = level.BLUE;
        this.skillTree = new SkillTree();
    }

    public int getCurrentXp() {

        return this.xp;
    }

    public level getCurrentLevel() {
        return this.currentLevel;
    }

    public SkillTree getSkillTree() {
        return this.skillTree;
    }

    public void addXp() {
        this.xp++;
        updateLevel();
    }

    private void updateLevel() {
        if(this.xp > 6) this.currentLevel = level.YELLOW;
        if(this.xp > 18) this.currentLevel = level.ORANGE;
        if(this.xp > 42) this.currentLevel = level.RED;
    }
}
