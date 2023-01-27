package RaysMusicExchange.Inventory;

import RaysMusicExchange.Instruments.InstrumentTypes.InstrumentType;
import RaysMusicExchange.Instruments.InstrumentTypes.TrumpetType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DooWopHornTest {

    DooWopHorn dooWopHorn;

    @Before
    public void setUp()  {
         dooWopHorn = new DooWopHorn(InstrumentType.BRASS,
                "Silver",
                "Besson",
                "Gold",
                TrumpetType.BUGLE,
                250,
                750,
                "For the discerning horn player");
    }

    @Test
    public void hasTrumpetType() {
        assertEquals(TrumpetType.BUGLE, dooWopHorn.getTrumpetType());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.BRASS, dooWopHorn.getInstrumentType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Silver", dooWopHorn.getMaterial());
    }

    @Test
    public void hasSupplier() {
        assertEquals("Besson", dooWopHorn.getSupplier());
    }

    @Test
    public void hasColour() {
        assertEquals("Gold", dooWopHorn.getColour());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(250, dooWopHorn.getBuyPrice(), 0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(750, dooWopHorn.getSellPrice(), 0);
    }

    @Test
    public void hasDescription() {
        assertEquals("For the discerning horn player", dooWopHorn.getDescription());
    }

    @Test
    public void canPlay() {
        assertEquals("Generic Trumpet Parps", dooWopHorn.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(500, dooWopHorn.calculateMarkup(),0 );
    }
}