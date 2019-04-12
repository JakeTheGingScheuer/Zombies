package zombies;

public class Survivor {

    private String name;
    private int wounds;
    private Inventory inventory;

    public Survivor(String name, Inventory inventory) {
        this.name = name;
        this.wounds = 0;
        this.inventory = inventory;
    }

    public int getWounds() {
        return wounds;
    }

    public String getName() {
        return this.name;
    }

    public Inventory getInventory() {
        return this.inventory;
    }
}
