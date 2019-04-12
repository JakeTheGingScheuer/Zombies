package zombies;

public class Inventory {

    private String[] inventory;

    public Inventory() {
        inventory = new String[5];
    }

    public int getSlots() {
        return inventory.length;
    }
}
