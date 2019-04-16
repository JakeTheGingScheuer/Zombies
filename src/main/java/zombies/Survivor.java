package zombies;

public class Survivor {

    private String name;
    private Inventory inventory;
    private Progression progression;
    private boolean wounded;

    public Survivor(String name) {
        this.name = name.toUpperCase();
        this.wounded = false;
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

    public void getsHurt() {
        this.wounded = true;
    }

    public boolean isWounded() {
        return this.wounded;
    }
}
