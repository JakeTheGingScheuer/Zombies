package zombies;

public class Survivor {

    private String name;
    private int wounds;
    private Inventory inventory;
    private Progression progression;

    public Survivor(String name) {
        this.name = name.toUpperCase();
        this.wounds = 0;
        this.inventory = new Inventory();
        this.progression = new Progression();
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

    public Progression getProgression() {
        return this.progression;
    }
}
