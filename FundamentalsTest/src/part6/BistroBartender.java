package part6;

import Part1.part2.Expresso;
import jdk.internal.icu.text.UnicodeSet;
import part3.Drinkable;
import part4.Bartender;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class BistroBartender implements Bartender {
    Drinkable drinkable = new Drinkable() {
        @Override
        public String drink() {
            return drink();
        }

        @Override
        public Integer getPrice() {
            return this.getPrice();
        }

        @Override
        public Integer getTemperature() {
            return this.getTemperature();
        }
    };


    @Override
    public void showMenu() {
        System.out.println("1. Expresso" + drinkable.getPrice());
        System.out.println("2. Latte" + drinkable.getPrice());
        System.out.println("3. Milk" + drinkable.getPrice());
        System.out.println("4. SoyMilk" + drinkable.getPrice());

    }

    ArrayList<Integer> orders = new ArrayList<Integer>();

    @Override
    public void addDrinkable(Drinkable drink) {

        orders.add(drinkable.getPrice());
        orders.add(drinkable.getPrice());
        orders.add(drinkable.getPrice());
        orders.add(drinkable.getPrice());
        orders.forEach((n) -> {
            System.out.println(n);
        });


    }


    public Integer calculateTotal() {
        return this.orders.size();

        }


    @Override
    public void printTicket() {
        Drinkable drinkable = new Drinkable() {
            @Override
            public String drink() {
                return "Your Drink: " + this.drink();
            }

            @Override
            public Integer getPrice() {
                return this.getPrice();
            }

            @Override
            public Integer getTemperature() {
                return this.getTemperature();
            }
        };
    }
}
