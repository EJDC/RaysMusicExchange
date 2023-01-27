package RaysMusicExchange.Inventory;

import RaysMusicExchange.Instruments.InstrumentTypes.InstrumentType;
import RaysMusicExchange.Instruments.InstrumentTypes.TrumpetType;
import RaysMusicExchange.Instruments.Trumpet;
import RaysMusicExchange.Interfaces.ISell;

public class DooWopHorn extends Trumpet implements ISell {


    private double buyPrice;

    private double sellPrice;

    private String description;

    public DooWopHorn(InstrumentType instrumentType, String material, String supplier, String colour, TrumpetType trumpetType, double buyPrice, double sellPrice, String description) {
        super(instrumentType, material, supplier, colour, trumpetType);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.description = description;
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

    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
