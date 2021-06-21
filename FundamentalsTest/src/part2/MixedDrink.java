package part2;

import part1.ColdDrink;
import part1.HotDrink;


abstract class MixedDrink {

    private String name;
    private HotDrink hotDrink;
    private ColdDrink coldDrink;
    private Integer percentage;

    public MixedDrink(String name, HotDrink hotDrink, ColdDrink coldDrink, int percentage) {
        this.name = name;
        this.hotDrink = hotDrink;
        this.coldDrink = coldDrink;
        this.percentage = percentage;
    }

    public int calcPrice() {
        return coldDrink.getPrice() + hotDrink.getPrice();
    }

    public int calcTemperature() {
        int temp_hot_drink = hotDrink.getTemperature();
        return (temp_hot_drink * percentage + 10 * (100 - percentage)) / 100;
    }

}