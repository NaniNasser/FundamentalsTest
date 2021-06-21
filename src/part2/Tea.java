package part2;

import part1.HotDrink;
import part3.Drinkable;

public abstract class Tea extends HotDrink implements Drinkable {

    public Tea(){
        super(3, 90, "Tea");
    }
}
