package RaysMusicExchange.Instruments;

import RaysMusicExchange.Instruments.InstrumentTypes.GuitarType;
import RaysMusicExchange.Instruments.InstrumentTypes.InstrumentType;

public class Guitar extends Instrument{

    private int numberOfStrings;
    private GuitarType guitarType;

    public Guitar(InstrumentType instrumentType, String material, String supplier, String colour, int numberOfStrings, GuitarType guitarType) {
        super(instrumentType, material, supplier, colour);
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public String play() {
        return "Generic Guitar Solo!";
    }
}
