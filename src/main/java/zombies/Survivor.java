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
        } else {
            this.inventory = reduceInventory();
        }
        wounded = true;
    }

    private String[] reduceInventory() {
        String[] smallerInventory = new String[4];
        for(int i = 0; i < smallerInventory.length; i++){
            smallerInventory[i] = this.inventory[i];
        }
        return smallerInventory;
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
