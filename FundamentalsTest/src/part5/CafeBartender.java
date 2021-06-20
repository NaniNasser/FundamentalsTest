package part5;

import Part1.part2.Expresso;
import Part1.part2.Latte;
import part3.Drinkable;
import part4.Bartender;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeBartender implements Bartender {

    Drinkable drinkable = new Drinkable() {
        @Override
        public String drink() {
            return this.drink();
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

    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();

    @Override
    public void showMenu() {

        System.out.println("1. Expresso" + drinkable.getPrice());
        System.out.println("2. Latte" + drinkable.getPrice());
        System.out.println("3. Milk" + drinkable.getPrice());
        System.out.println("4. SoyMilk" + drinkable.getPrice());

                    }


    @Override
    public void addDrinkable(Drinkable drinkable) {
        System.out.println("1. Expresso" + drinkable.getPrice());
        System.out.println("2. Latte" + drinkable.getPrice());
        System.out.println("3. Milk" + drinkable.getPrice());
        System.out.println("4. SoyMilk" + drinkable.getPrice());
        System.out.println("  ");
        System.out.println("Make a choice: ");

        ArrayList<String> orders = new ArrayList<String>();

        if (choice == 1) {
            orders.add("Expresso" + drinkable.getPrice());

        } else {
            if (choice == 2) {
                orders.add("Latte" + drinkable.getPrice());
            } else {
                if (choice == 3) {
                    orders.add("Milk" + drinkable.getPrice());
                } else {
                    if (choice == 4) {
                        orders.add("SoyMilk" + drinkable.getPrice());
                    }


                }

            }

        }
        orders.forEach((n) -> {
            System.out.println(n);
        });
    }



    @Override
    public Integer calculateTotal() {
    return this.calculateTotal();

    }

    @Override
    public void printTicket() {
        System.out.println();

        };

    }

