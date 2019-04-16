package zombies;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class InventoryTest {

    Inventory subject;

    @Before
    public void setUp() {
        initMocks(this);
        subject = new Inventory();
    }

    @Test
    public void whenInventoryIsCreatedItHas5Slots() {
        int expected = 5;
        int actual = subject.getTotalSlots();
        assertEquals(actual, expected);
    }

    @Test
    public void inHandEquipmentHasTwoSlots() {
        int expected = 2;
        int actual = subject.getInHandSlots();
        assertEquals(actual, expected);
    }

    @Test
    public void reserveEquipmentHasThreeSlots() {
        int expected = 3;
        int actual = subject.getReserveSlots();
        assertEquals(actual, expected);
    }
}
