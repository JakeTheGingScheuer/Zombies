package zombies;

public class Survivor {

    private String name;
    private int wounds;


    public Survivor(String name) {
        this.name = name;
        this.wounds = 0;
    }

    public int getWounds() {
        return wounds;
    }

    public String getName() {
        return this.name;
    }
}
