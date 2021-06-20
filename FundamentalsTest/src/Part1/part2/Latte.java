package Part1.part2;

import Part1.ColdDrink;
import Part1.HotDrink;
import part3.Drinkable;

import javax.print.attribute.HashPrintJobAttributeSet;

public abstract class Latte extends MixedDrink implements Drinkable {


    public Latte(ColdDrink coldDrink, HotDrink hotDrink) {

        super("Latte", hotDrink, coldDrink, 54);


    }
}








