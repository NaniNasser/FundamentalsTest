package Part1.part2;

import Part1.ColdDrink;
import part3.Drinkable;

public abstract class Milk extends ColdDrink implements Drinkable {


    public Milk(String name, Integer price) {
        super(name = "Milk", price = 1);
    }

    public String drink(){
        return "Drinking milk";
    }

}
