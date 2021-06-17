import Part1.ColdDrink;
import part3.Drinkable;

public class Main {
    public static void main(String[] args) {


Drinkable drinkable = new Drinkable() {
    @Override
    public String drink() {
        return drink();
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
    }
}
