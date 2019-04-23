public class Survivor {

    private String name;
    private int wounds;

    public Survivor(String survivorName) {
        this.name = survivorName;
        this.wounds = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfWounds() {
        return this.wounds;
    }

    public void getsHurt() {
        this.wounds++;
    }

    public boolean isDead() {
        if(wounds == 2) return true;
        return false;
    }
}
