package Part1.part2;

import Part1.ColdDrink;
import Part1.HotDrink;


public class MixedDrink {


    public MixedDrink(String name, HotDrink hotDrink, ColdDrink coldDrink ,Integer percentage) {
        String nameHotDrink = hotDrink.getName();
        String nameColdDrink = coldDrink.getName();
        int priceCold = coldDrink.getPrice();
        int priceHot = hotDrink.getPrice();
        int calcPriceNow = hotDrink.calcPrice(coldDrink.getPrice());
        int percentageResult = (hotDrink.getTemperature() * percentage +10 * (100 - percentage)) / 100;





    }

}
