package part2;

import part1.ColdDrink;
import part3.Drinkable;

public abstract class SoyMilk extends ColdDrink implements Drinkable {

    public SoyMilk() {
        super("Soy Milk",2);
    }
    public String drink(){
        return "Drinking " + this.getName();
    }

}
