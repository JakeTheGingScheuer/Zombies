import java.util.ArrayList;

public class Survivor {
    private String name;
    private int wounds;
    private ArrayList<String> equipmentInHand;
    private ArrayList<String> reserveEquipment;

    public Survivor(String name) {
        this.name = name;
        this.wounds = 0;
        this.equipmentInHand = new ArrayList<>();
        this.reserveEquipment = new ArrayList<>();
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

    public int getNumberOfActionsPerTurn() {
        return 3;
    }

    public String[] getEquipmentInHand() {
        return this.equipmentInHand.stream().toArray(String[]::new);
    }

    public String[] getReserveEquipment() {
        return this.reserveEquipment.stream().toArray(String[]::new);
    }

    public void pickUpEquipment(String equipment) {
        if(this.equipmentInHand.size() < 2) {
            this.equipmentInHand.add(equipment);
        }
    }

    public void putInPack(String equipment) {
        if(this.reserveEquipment.size() < maxAllowedReserve()){
            this.reserveEquipment.add(equipment);
        }
    }

    private int maxAllowedReserve() {
        return 5 - this.equipmentInHand.size();
    }
}
