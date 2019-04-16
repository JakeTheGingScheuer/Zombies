import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;


public class SurvivorTest {

    Survivor survivor = new Survivor("Steve");
    @Test
    public void whenSurvivorIsCreatedItHasAName() {
        assertEquals("Steve", survivor.getName());
    }

    @Test
    public void whenSurvivorIsCreatedItHasNoWounds() {
        int expected = 0;
        int actual = survivor.getNumberOfWounds();

        assertEquals(expected, actual);
    }

    @Test
    public void whenSurvivorReceivesTwoWoundsItDies() {
        survivor.injure();
        survivor.injure();

        assertTwoWoundsDies();
    }

    private void assertTwoWoundsDies() {
        assertFalse(survivor.isAlive());
        assertEquals(2, survivor.getNumberOfWounds());
    }

    @Test
    public void whenSurvivorIsCreatedItIsAlive () {
        assertTrue(survivor.isAlive());
    }

    @Test
    public void whenASurvivorIsCreatedTheyHaveThreeActionsPerTurn() {
        assertEquals(3, survivor.getNumberOfActionsPerTurn());
    }

    @Test
    public void whenASurvivorIsCreatedItCarriesNoEquipment() {
        assertEquals(0, survivor.getEquipmentInHand().length);
        assertEquals(0, survivor.getReserveEquipment().length);
    }

    @Test
    public void whenPickUpEquipmentIsCalledEquipmentIsAddedToInHand() {
        survivor.pickUpEquipment("baseball bat");
        assertArrayEquals(new String[] {"baseball bat" }, survivor.getEquipmentInHand());
    }

    @Test
    public void whenPutInPackThenEquipmentIsAddedToReserve() {
        survivor.putInPack("baseball bat");
        assertArrayEquals(new String[] {"baseball bat"}, survivor.getReserveEquipment());
    }

    @Test
    public void whenTwoItemsAreInHandAndPickUpIsCalledNothingHappens() {
        survivor.pickUpEquipment("fake1");
        survivor.pickUpEquipment("fake2");
        survivor.pickUpEquipment("fake3");
        assertArrayEquals(new String[] {"fake1", "fake2"}, survivor.getEquipmentInHand());
    }

    @Test
    public void whenFiveItemsAreInReserveThenPutInPackDoesNothing() {
        survivor.putInPack("fake1");
        survivor.putInPack("fake2");
        survivor.putInPack("fake3");
        survivor.putInPack("fake4");
        survivor.putInPack("fake5");
        survivor.putInPack("fake6");
        assertArrayEquals(new String[] {"fake1", "fake2", "fake3", "fake4", "fake5"}, survivor.getReserveEquipment());

    }

    @Test
    public void whenTwoItemsAreInHandAndThreeInPackPutInPackDoesNothing() {
        survivor.pickUpEquipment("fake1");
        survivor.pickUpEquipment("fake2");
        survivor.putInPack("fake3");
        survivor.putInPack("fake4");
        survivor.putInPack("fake5");
        survivor.putInPack("fake6");
        assertArrayEquals(new String[] {"fake3", "fake4", "fake5"}, survivor.getReserveEquipment());
    }
}
