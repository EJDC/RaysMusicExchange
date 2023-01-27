package RaysMusicExchange.Inventory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BluesBrothersCDTest {

    BluesBrothersCD bluesBrothersCD;

    @Before
    public void setUp()  {
        bluesBrothersCD = new BluesBrothersCD(30, 50, "Signed by Ray, Elwood and Jake");
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(30, bluesBrothersCD.getBuyPrice(), 0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(50, bluesBrothersCD.getSellPrice(), 0 );
    }

    @Test
    public void hasDescription() {
        assertEquals("Signed by Ray, Elwood and Jake", bluesBrothersCD.getDescription());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(20, bluesBrothersCD.calculateMarkup(),0);

    }

}