package RaysMusicExchange.Inventory;

import RaysMusicExchange.Instruments.InstrumentTypes.GuitarType;
import RaysMusicExchange.Instruments.InstrumentTypes.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeagullS6Test {

    SeagullS6 seagullS6;

    @Before
    public void setUp() {
        seagullS6 = new SeagullS6(InstrumentType.STRING,
                "Wood",
                "Godin Guitars",
                "Wood Effect",
                6, GuitarType.ACOUSTIC,
                450.00,
                950.00,
                "A beautiful Seagull S6 Acoustic Guitar");
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, seagullS6.getNumberOfStrings());
    }

    @Test
    public void hasGuitarType() {
        assertEquals(GuitarType.ACOUSTIC, seagullS6.getGuitarType());
    }


    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.STRING, seagullS6.getInstrumentType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", seagullS6.getMaterial());
    }

    @Test
    public void hasSupplier() {
        assertEquals("Godin Guitars", seagullS6.getSupplier());
    }

    @Test
    public void hasColour() {
        assertEquals("Wood Effect", seagullS6.getColour());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(450.00, seagullS6.getBuyPrice(), 0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(950.00, seagullS6.getSellPrice(), 0);
    }

    @Test
    public void hasDescription() {
        assertEquals("A beautiful Seagull S6 Acoustic Guitar", seagullS6.getDescription());
    }

    @Test
    public void canPlay() {
        assertEquals("Gentle Strumming of the Seagull S6 Acoustic", seagullS6.play());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(500, seagullS6.calculateMarkup(), 0);
    }

}