package service;

import model.Food;

public class ShoppingCart {

    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            Food item = items[i];
            double itemPrice = item.getAmount() * item.getPrice();
            total = total + itemPrice;
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;

        for (int i = 0; i < items.length; i++) {
            Food item = items[i];
            double price = item.getPrice();
            int amount = item.getAmount();
            double discount = item.getDiscount();

            double discountedPrice = price - (price * discount / 100);
            double itemTotal = amount * discountedPrice;

            total = total + itemTotal;
        }

        return total;
    }

    public double getVegetarianTotalPriceWithoutDiscount() {
        double total = 0;

        for (int i = 0; i < items.length; i++) {
            Food item = items[i];
            if (item.isVegetarian()) {
                double itemPrice = item.getAmount() * item.getPrice();
                total = total + itemPrice;
            }

        }
        return total;
    }
}
