public class Survivor {
    private String name;
    private int wounds;

    public Survivor(String name) {
        this.name = name;
        this.wounds = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfWounds() {
        return this.wounds;
    }

    public void injure() {
        this.wounds++;
    }

    public boolean isAlive() {
        return this.wounds < 2;
    }
}
