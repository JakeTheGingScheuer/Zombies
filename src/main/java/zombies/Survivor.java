package zombies;

public class Survivor {

    private String name;
    private boolean wounded = false;
    private boolean dead = false;
    private int actionsPerTurn;
    private String[] inventory;

    public Survivor(String name) {
        this.name = name;
        this.actionsPerTurn = 3;
        this.inventory = new String[5];
    }

    public boolean isWounded() {
        return wounded;
    }

    public String getName() {
        return this.name;
    }

    public void getsHurt() {
        if(wounded){
            dead = true;
        }
        wounded = true;
    }

    public boolean isDead() {
        return dead;
    }

    public int getActionsPerTurn() {
        return actionsPerTurn;
    }

    public int getInventorySlots() {
        return inventory.length;
    }
}
