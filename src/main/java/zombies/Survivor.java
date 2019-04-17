package zombies;

public class Survivor {

    private String name;
    private Inventory inventory;
    private Progression progression;
    private Status status;

    public Survivor(String name) {
        this.name = name;
        this.status = new Status();
        this.inventory = new Inventory();
        this.progression = new Progression();
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

    public Status getStatus() { return this.status; }

    public void getsHurt() {
        this.status.addWound();
        this.inventory.decreaseCapacity();
    }

    public void killZombie() {
        this.progression.addXp();
    }
}
