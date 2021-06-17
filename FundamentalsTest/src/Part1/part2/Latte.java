package Part1.part2;

import Part1.ColdDrink;
import Part1.HotDrink;
import part3.Drinkable;

public abstract class Latte extends MixedDrink  implements Drinkable {




    public Latte(ColdDrink coldDrink) {
        super("Latte", new Expresso(3, 80, "Expresso"), coldDrink, 50);




}
}
