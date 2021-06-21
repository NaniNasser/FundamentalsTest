package part2;

import part1.ColdDrink;
import part1.HotDrink;
import part3.Drinkable;

public abstract class Latte extends MixedDrink implements Drinkable {

    public Latte(ColdDrink coldDrink) {
        super("Latte", new Expresso() , coldDrink, 54);
    }
}








