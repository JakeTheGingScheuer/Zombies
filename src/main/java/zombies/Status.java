package zombies;

public class Status {
    private boolean wounded;
    private boolean dead;
    private int numberOfActions;

    public Status() {

        this.wounded = false;
        this.dead = false;
        this.numberOfActions = 3;
    }

    public void addWound() {
        if(wounded){
            this.dead = true;
        }
        this.wounded = true;
    }

    public boolean isWounded() {
        return this.wounded;
    }

    public boolean isDead() {
        return this.dead;
    }

    public int getNumberOfActions() {
        return this.numberOfActions;
    }
}
