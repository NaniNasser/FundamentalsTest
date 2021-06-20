package Part1.part2;

import Part1.HotDrink;
import part3.Drinkable;

public class Expresso extends HotDrink implements Drinkable  {

    public Expresso(Integer price, Integer temperature, String name) {
        super(price = 3, temperature = 80, name = "Expresso");
    }




    public String drink(){
        return "Drinking Expresso";
    }
}
