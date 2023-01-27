package RaysMusicExchange.Inventory;

import RaysMusicExchange.Instruments.InstrumentTypes.InstrumentType;
import RaysMusicExchange.Instruments.InstrumentTypes.SaxaphoneType;
import RaysMusicExchange.Instruments.Saxophone;
import RaysMusicExchange.Interfaces.ISell;

public class SavourySaxophone extends Saxophone implements ISell {

    private double buyPrice;

    private double sellPrice;

    private String description;


    public SavourySaxophone(InstrumentType instrumentType, String material, String supplier, String colour, SaxaphoneType saxaphoneType, double buyPrice, double sellPrice, String description) {
        super(instrumentType, material, supplier, colour, saxaphoneType);
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

    public String play() {
        return "Savoury Sax Tones";
    }
}
