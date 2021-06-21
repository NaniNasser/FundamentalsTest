import part2.Expresso;
import part3.Drinkable;
import part5.CafeBartender;
import part6.BistroBartender;

public class Main {
    public static void main(String[] args) {


        BistroBartender bistroBartender = new BistroBartender();
        CafeBartender cafeBartender = new CafeBartender();

        Expresso drinkable = new Expresso();


        cafeBartender.addDrinkable(drinkable);

    }
}
