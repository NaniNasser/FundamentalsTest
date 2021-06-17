package Part1.part2;

import Part1.ColdDrink;
import part3.Drinkable;

public abstract class SoyMilk extends ColdDrink implements Drinkable {

    public SoyMilk(String name, Integer price) {
        super(name = "Soy Milk", price = 2);
    }
    public String drink(){
        return "Drinking " + this.getName();
    }

}
