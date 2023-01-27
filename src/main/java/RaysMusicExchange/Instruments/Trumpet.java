package RaysMusicExchange.Instruments;

import RaysMusicExchange.Instruments.InstrumentTypes.InstrumentType;
import RaysMusicExchange.Instruments.InstrumentTypes.TrumpetType;

public class Trumpet extends Instrument {

    TrumpetType trumpetType;

    public Trumpet(InstrumentType instrumentType, String material, String supplier, String colour, TrumpetType trumpetType) {
        super(instrumentType, material, supplier, colour);
        this.trumpetType = trumpetType;
    }

    public TrumpetType getTrumpetType() {
        return trumpetType;
    }

    public String play() {
        return "Generic Trumpet Parps";
    }
}
