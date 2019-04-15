package zombies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InventoryTest {

    Inventory subject;

    @Before
    public void setUp() {
        subject = new Inventory();
    }

    @Test
    public void whenInventoryIsCreatedItHas5Slots() {
        int expected = 5;
        int actual = subject.getSlots();
        assertEquals(actual, expected);
    }
}
