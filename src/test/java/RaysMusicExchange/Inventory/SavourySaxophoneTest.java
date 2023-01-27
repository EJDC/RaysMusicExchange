package RaysMusicExchange.Inventory;

import RaysMusicExchange.Instruments.InstrumentTypes.InstrumentType;
import RaysMusicExchange.Instruments.InstrumentTypes.SaxaphoneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SavourySaxophoneTest {

    SavourySaxophone savourySaxophone;

    @Before
    public void setUp() {
        savourySaxophone = new SavourySaxophone(InstrumentType.WOODWIND,
                "Brass Plated",
                "Yamaha",
                "Brass",
                SaxaphoneType.ALTO,
                300.00,
                600.00,
                "Great Saxophone for Beginners and Pros");
    }

    @Test
    public void hasSaxaphoneType() {
        assertEquals(SaxaphoneType.ALTO, savourySaxophone.getSaxaphoneType());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.WOODWIND, savourySaxophone.getInstrumentType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Brass Plated", savourySaxophone.getMaterial());
    }

    @Test
    public void hasSupplier() {
        assertEquals("Yamaha", savourySaxophone.getSupplier());
    }

    @Test
    public void hasColour() {
        assertEquals("Brass", savourySaxophone.getColour());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(300.00, savourySaxophone.getBuyPrice(), 0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(600.00, savourySaxophone.getSellPrice(), 0);
    }


    @Test
    public void hasDescription() {
        assertEquals("Great Saxophone for Beginners and Pros", savourySaxophone.getDescription());
    }

    @Test
    public void canPlay() {
        assertEquals("Savoury Sax Tones", savourySaxophone.play());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(300, savourySaxophone.calculateMarkup(), 0);
    }
}