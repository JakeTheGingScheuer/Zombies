package zombies;

import java.util.List;

public class Survivor {

    private String name;
    private int wounds;
    private String[] inventory;

    public Survivor(String name) {
        this.name = name;
        this.wounds = 0;
        this.inventory = new String[5];
    }

    public int getWounds() {
        return wounds;
    }

    public String getName() {
        return this.name;
    }

    public int getInventorySlots() {
        return inventory.length;
    }
}
