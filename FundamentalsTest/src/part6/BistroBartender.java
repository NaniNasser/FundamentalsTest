package part6;

import part3.Drinkable;
import part4.Bartender;

import java.util.ArrayList;

public class BistroBartender implements Bartender {
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


    @Override
    public void showMenu() {
        System.out.println("1. Expresso");
        System.out.println("2. Latte");
        System.out.println("3. Milk");
        System.out.println("4. SoyMilk");

    }

    @Override
    public void addDrinkable(Drinkable drink) {
        ArrayList<String> orders = new ArrayList<String>();

        orders.add("Expresso");
        orders.add("Latte");
        orders.add("Milk");
        orders.add("SoyMilk");
        orders.forEach( (n) -> { System.out.println(n); } );
    }


    @Override
    public Integer calculateTotal() {
        return drinkable.getPrice();
    }

    @Override
    public void printTicket() {
        drinkable.getPrice();

    }
}
