package RaysMusicExchange.Inventory;

import RaysMusicExchange.Instruments.Guitar;
import RaysMusicExchange.Instruments.InstrumentTypes.GuitarType;
import RaysMusicExchange.Instruments.InstrumentTypes.InstrumentType;
import RaysMusicExchange.Interfaces.ISell;

public class SeagullS6 extends Guitar implements ISell {

    private double buyPrice;

    private double sellPrice;

    private String description;

    public SeagullS6(InstrumentType instrumentType, String material, String supplier, String colour, int numberOfStrings, GuitarType guitarType, double buyPrice, double sellPrice, String description) {
        super(instrumentType, material, supplier, colour, numberOfStrings, guitarType);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.description = description;
    }

    public String play() {
        return "Gentle Strumming of the Seagull S6 Acoustic";
    }

    public double calculateMarkup() {
        return sellPrice- buyPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getDescription() {
        return description;
    }
}
