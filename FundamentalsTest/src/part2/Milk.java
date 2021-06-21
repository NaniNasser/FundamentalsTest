package part2;

import part1.ColdDrink;
import part3.Drinkable;

public abstract class Milk extends ColdDrink implements Drinkable {

    public Milk() {
        super("Milk", 1);
    }

    public String drink(){
        return "Drinking milk";
    }

}
