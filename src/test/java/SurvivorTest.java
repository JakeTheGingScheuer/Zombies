import org.junit.Test;

import static org.junit.Assert.*;

public class SurvivorTest {

    Survivor survivor = new Survivor("Karl");

    @Test
    public void whenSurviorIsCreatedItHasAName() {
        assertEquals("Karl", survivor.getName());
    }

    @Test
    public void whenSurvivorIsCreatedItHasZeroWounds() {
        assertEquals(0, survivor.getNumberOfWounds());
    }

    @Test
    public void whenASurvivorGetsWoundedTwiceTheyAreDead() {
        survivor.getsHurt();
        survivor.getsHurt();
        assertTrue(survivor.isDead());
    }

    @Test
    public void aSurvivorCannotReceiveMoreThanTwoWounds() {
        survivor.getsHurt();
        survivor.getsHurt();
        survivor.getsHurt();
        assertEquals(2, survivor.getNumberOfWounds());
    }

    @Test
    public void whenASurvivorIsCreatedTheHaveThreeActionsPerTurn() {
        assertEquals(3, survivor.getNumberOfActions());
    }

    @Test
    public void survivorCanCarryFivePiecesOfEquipment() {
        assertEquals(5, survivor.getMaxCapacity());
    }

    @Test
    public void whenSurvivorEquipsItemItStoresItInHand() {
        survivor.equipItem("fakeBat");
        assertArrayEquals(new String[]{"fakeBat"}, survivor.getInHandItems().toArray());
    }

    @Test
    public void aSurvivorCanOnlyEquipTwoItems() {
        survivor.equipItem("fakeBat");
        survivor.equipItem("fakeTorch");
        survivor.equipItem("fakeMedKit");
        assertEquals(2, survivor.getInHandItems().size());
    }

    @Test
    public void whenASurvivorHasTwoItemsInHandTheyPutNextItemInReserve() {
        survivor.equipItem("fakeBat");
        survivor.equipItem("fakeTorch");
        survivor.equipItem("fakeMedKit");
        assertArrayEquals(new String[]{"fakeMedKit"}, survivor.getReserveInventory().toArray());
    }

    @Test
    public void whenASurvivorIsWoundedReserveCapacityIsReducedByOne() {
        survivor.getsHurt();
        assertEquals(4, survivor.getMaxCapacity());
    }

    @Test
    public void whenASurvivorIsCarryingFiveItemsAndGetsHurtTheyMustDropOne() {
        survivor.putItemInPack("1");
        survivor.putItemInPack("2");
        survivor.putItemInPack("3");
        survivor.equipItem("4");
        survivor.equipItem("5");
        survivor.getsHurt();
        assertArrayEquals(new String[]{"1", "2"}, survivor.getReserveInventory().toArray());
    }
}
