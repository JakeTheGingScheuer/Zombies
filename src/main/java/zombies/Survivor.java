package zombies;

public class Survivor {

    private String name;
    private boolean wounded = false;
    private boolean dead = false;
    private int actionsPerTurn;
    private String[] reserves;
    private String[] hands;
    private int totalXP;
    private String level;

    public Survivor(String name) {
        this.name = name;
        this.actionsPerTurn = 3;
        this.reserves = new String[3];
        this.hands = new String[2];
        this.totalXP = 0;
        this.level = "Blue";
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
            this.reserves = reduceInventoryCapacity();
        }
        wounded = true;
    }

    private String[] reduceInventoryCapacity() {
        String[] smallerInventory = new String[2];
        for(int i = 0; i < smallerInventory.length; i++){
            smallerInventory[i] = this.reserves[i];
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
        return reserves.length + hands.length;
    }

    public int countHands() {
        return hands.length;
    }

    public int getCurrentXP() {
        return totalXP;
    }

    public String getCurrentLevel() {
        return level;
    }

    public void kill() {
        this.totalXP++;
    }
}
