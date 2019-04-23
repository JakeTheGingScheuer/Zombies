import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Survivor {

    private String name;
    private int wounds;
    private int numberOfActions;
    private List itemsInHand;
    private List reserveInventory;

    public Survivor(String survivorName) {
        this.name = survivorName;
        this.wounds = 0;
        this.numberOfActions = 3;
        this.itemsInHand = new ArrayList();
        this.reserveInventory = new ArrayList();
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfWounds() {
        return this.wounds;
    }

    public void getsHurt() {
        if(this.wounds < 2) this.wounds++;
    }

    public boolean isDead() {
        if(wounds == 2) return true;
        return false;
    }

    public int getNumberOfActions() {
        return this.numberOfActions;
    }

    public int getNumberOfAvailableInventorySlots() {
        return 5;
    }

    public void equipItem(String equipmentItem) {
        if(this.itemsInHand.size() < 2) this.itemsInHand.add(equipmentItem);
        else if(this.reserveInventory.size() < 3) this.reserveInventory.add(equipmentItem);
    }

    public List getInHandItems() {
        return this.itemsInHand;
    }

    public List getReserveInventory() {
        return this.reserveInventory;
    }
}
