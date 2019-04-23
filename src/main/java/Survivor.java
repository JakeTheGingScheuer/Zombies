public class Survivor {

    private String name;
    private int wounds;
    private int numberOfActions;
    private String[] inventory;

    public Survivor(String survivorName) {
        this.name = survivorName;
        this.wounds = 0;
        this.numberOfActions = 3;
        this.inventory = new String[5];
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfWounds() {
        return this.wounds;
    }

    public void getsHurt() {
        if(this.wounds < 2) this.wounds++;
    }

    public boolean isDead() {
        if(wounds == 2) return true;
        return false;
    }

    public int getNumberOfActions() {
        return this.numberOfActions;
    }

    public int getNumberOfAvailableInventorySlots() {
        return inventory.length;
    }
}
