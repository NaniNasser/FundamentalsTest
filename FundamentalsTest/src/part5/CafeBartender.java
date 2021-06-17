package part5;

import Part1.part2.Expresso;
import part3.Drinkable;
import part4.Bartender;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeBartender implements Bartender {

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
        return drinkable.getPrice() * 2;
    }

    @Override
    public void printTicket() {
        Drinkable drinkable = new Drinkable() {
            @Override
            public String drink() {
                return "Order name: " + drink();

            }

            @Override
            public Integer getPrice() {
                return getPrice() * 2;
                
            }


        };

    }
}
