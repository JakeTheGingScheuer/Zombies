public class Survivor {
    private String name;
    private int wounds;
    private String[] equipmentInHand;
    private String[] reserveEquipment;

    public Survivor(String name) {
        this.name = name;
        this.wounds = 0;
        this.equipmentInHand = new String[0];
        this.reserveEquipment = new String[0];
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
        return this.equipmentInHand;
    }

    public String[] getReserveEquipment() {
        return this.reserveEquipment;
    }
}
