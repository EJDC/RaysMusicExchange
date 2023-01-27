package RaysMusicExchange;

import RaysMusicExchange.Interfaces.ISell;

import java.util.ArrayList;

public class RaysMusicExchangeShop {

        private static RaysMusicExchangeShop instance = null;

        private ArrayList<ISell> inventory;

        private RaysMusicExchangeShop() {
            inventory = new ArrayList<>();
        }

        public static RaysMusicExchangeShop getInstance() {
            if (instance == null) {
                instance = new RaysMusicExchangeShop();
            }
            return instance;
        }

        public ArrayList<ISell> getInventory() {
            return inventory;
        }

        public void addToInventory(ISell newItem) {
            inventory.add(newItem);
        }

        public void removeFromInventory(ISell itemForRemoval) {
            inventory.remove(itemForRemoval);
    }

    public void clearInventory() {
            inventory.clear();
    }

    public double calculatePotentialProfit() {
            double potentialProfit = 0;
        for (int i = 0; i < inventory.size(); i++) {
            ISell item = inventory.get(i);
            potentialProfit += item.calculateMarkup();
        }
        return potentialProfit;
    }
}
