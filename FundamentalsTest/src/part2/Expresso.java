package part2;

import part1.HotDrink;
import part3.Drinkable;

public class Expresso extends HotDrink implements Drinkable {

    public Expresso() { // waardes zijn standaard dus geen paramters nodig!
//    public Expresso(Integer price, Integer temperature, String name) {
//        super(price = 3, temperature = 80, name = "Expresso"); geen waarden toekennen hier
        super(3, 80,  "Expresso");

    }

    public String drink(){
        return "Drinking Expresso";
    }
}
