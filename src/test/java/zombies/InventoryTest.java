package zombies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InventoryTest {

    Inventory inventory = new Inventory();

    @Test
    public void whenInventoryIsCreatedItHas5Slots() {
        int expected = 5;
        int actual = inventory.getTotalSlots();
        assertEquals(actual, expected);
    }

    @Test
    public void inHandEquipmentHasTwoSlots() {
        int expected = 2;
        int actual = inventory.getInHandSlots();
        assertEquals(actual, expected);
    }

    @Test
    public void reserveEquipmentHasThreeSlots() {
        int expected = 3;
        int actual = inventory.getReserveSlots();
        assertEquals(actual, expected);
    }
}
