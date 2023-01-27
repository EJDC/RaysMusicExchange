package RaysMusicExchange;

import RaysMusicExchange.Instruments.InstrumentTypes.GuitarType;
import RaysMusicExchange.Instruments.InstrumentTypes.InstrumentType;
import RaysMusicExchange.Instruments.InstrumentTypes.SaxaphoneType;
import RaysMusicExchange.Inventory.BluesBrothersCD;
import RaysMusicExchange.Inventory.SavourySaxophone;
import RaysMusicExchange.Inventory.SeagullS6;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaysMusicExchangeShopTest {

    RaysMusicExchangeShop raysExchange;
    SeagullS6 seagullS6;
    SavourySaxophone savourySaxophone;
    BluesBrothersCD bluesBrothersCD;

    @Before
    public void setUp() {
        raysExchange = RaysMusicExchangeShop.getInstance();
        seagullS6 = new SeagullS6(InstrumentType.STRING,
                "Wood",
                "Godin Guitars",
                "Wood Effect",
                6, GuitarType.ACOUSTIC,
                450.00,
                950.00,
                "A beautiful Seagull S6 Acoustic Guitar");
        savourySaxophone = new SavourySaxophone(InstrumentType.WOODWIND,
                "Brass Plated",
                "Yamaha",
                "Brass",
                SaxaphoneType.ALTO,
                300.00,
                600.00,
                "Great Saxophone for Beginners and Pros");
        bluesBrothersCD = new BluesBrothersCD(30, 50, "Signed by Ray, Elwood and Jake");
        raysExchange.clearInventory();
    }

    @Test
    public void startsWithEmptyInventory() {
        assertEquals(0, raysExchange.getInventory().size());
    }

    @Test
    public void canAddToInventory() {
        raysExchange.addToInventory(bluesBrothersCD);
        assertEquals(1, raysExchange.getInventory().size());
    }

    @Test
    public void canRemoveFromInventory() {
        raysExchange.addToInventory(bluesBrothersCD);
        raysExchange.addToInventory(savourySaxophone);
        raysExchange.removeFromInventory(bluesBrothersCD);
        assertEquals(1, raysExchange.getInventory().size());
        assertTrue(raysExchange.getInventory().contains(savourySaxophone));
    }

    @Test
    public void canCalculateTotalPotentialProfit() {
        raysExchange.addToInventory(bluesBrothersCD);
        raysExchange.addToInventory(savourySaxophone);
        raysExchange.addToInventory(seagullS6);
        assertEquals(bluesBrothersCD.calculateMarkup() +
                savourySaxophone.calculateMarkup() +
                seagullS6.calculateMarkup(), raysExchange.calculatePotentialProfit(), 0);
    }


}