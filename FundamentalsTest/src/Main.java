import Part1.ColdDrink;
import Part1.HotDrink;
import Part1.part2.Milk;
import part3.Drinkable;
import part5.CafeBartender;
import part6.BistroBartender;

public class Main {
    public static void main(String[] args) {


        Drinkable drinkable = new Drinkable() {

            @Override
            public String drink() {
                return this.drink();
            }

            @Override
            public Integer getPrice() {
                return getPrice();
            }

            @Override
            public Integer getTemperature() {
                return getTemperature();
            }
        };
        BistroBartender bistroBartender = new BistroBartender();
        CafeBartender cafeBartender = new CafeBartender();

    }
}
