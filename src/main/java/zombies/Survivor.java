package zombies;

public class Survivor {

    private String name;
    private boolean wounded = false;
    private boolean dead = false;

    public Survivor(String name) {
        this.name = name;
    }

    public boolean isWounded() {
        return wounded;
    }

    public String getName() {
        return this.name;
    }

    public void getsHurt() {
        if(wounded){
            dead = true;
        }
        wounded = true;
    }

    public boolean isDead() {
        return dead;
    }
}
