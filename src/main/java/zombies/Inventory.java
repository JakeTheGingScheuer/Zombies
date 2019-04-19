package zombies;

public class Inventory {

    private String[] inHand;
    private String[] reserve;

    public Inventory() {
        inHand = new String[2];
        reserve = new String[3];
    }

    public int getTotalSlots() {
        return inHand.length + reserve.length;
    }

    public int getInHandSlots() {
        return inHand.length;
    }

    public int getReserveSlots() {
        return reserve.length;
    }

    public void decreaseCapacity() {
        String[] reducedInventory = new String[] {reserve[0], reserve[1]};
        this.reserve = reducedInventory;
    }

    public void equip(String item) {
        this.inHand[0] = item;
    }

    public void putInPack(String item) {
        this.reserve[0] = item;
    }
}
