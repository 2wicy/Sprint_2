package model;

import model.constants.Discount;
import model.constants.Colour;


public class Apple extends Food{
    private String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED)) {
            return Discount.APPLE_RED_DISCOUNT;
            }
        return 0;
    }
}
