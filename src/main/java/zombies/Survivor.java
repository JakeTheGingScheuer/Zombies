package zombies;

public class Survivor {

    private String name;
    private boolean wounded;

    public Survivor(String name) {
        this.name = name;
        this.wounded = false;
    }

    public boolean isWounded() {
        return wounded;
    }

    public String getName() {
        return this.name;
    }

    public void getsHurt() {
        wounded = true;
    }
}
