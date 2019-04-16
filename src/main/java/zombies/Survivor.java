package zombies;

public class Survivor {

    private String name;
    private Inventory inventory;
    private Progression progression;
    private boolean wounded;
    private boolean dead;
    private int numberOfActions;

    public Survivor(String name) {
        this.name = name.toUpperCase();
        this.wounded = false;
        this.inventory = new Inventory();
        this.progression = new Progression();
        this.dead = false;
        this.numberOfActions = 3;
    }

    public String getName() {
        return this.name;
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public Progression getProgression() {
        return this.progression;
    }

    public void getsHurt() {
        if(wounded){
            this.dead = true;
            return;
        }
        this.wounded = true;
        this.inventory.decreaseCapacity();
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
