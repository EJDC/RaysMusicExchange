package RaysMusicExchange.Instruments;

import RaysMusicExchange.Instruments.InstrumentTypes.InstrumentType;
import RaysMusicExchange.Instruments.InstrumentTypes.SaxaphoneType;

public class Saxophone extends Instrument {

    private SaxaphoneType saxaphoneType;

    public Saxophone(InstrumentType instrumentType, String material, String supplier, String colour, SaxaphoneType saxaphoneType) {
        super(instrumentType, material, supplier, colour);
        this.saxaphoneType = saxaphoneType;
    }

    public SaxaphoneType getSaxaphoneType() {
        return saxaphoneType;
    }

    public String play() {
        return "Generic Saxaphone Solo!!!";
    }
}
