package zombies;

public class Survivor {

    private String name;

    public Survivor(String name) {
        this.name = name;
    }

    public boolean isWounded() {
        return false;
    }

    public String getName() {
        return this.name;
    }
}
