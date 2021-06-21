package part6;

import part3.Drinkable;
import part4.Bartender;

import java.util.*;


public class BistroBartender implements Bartender {

    private List<Drinkable> orders = new ArrayList<>();

    @Override
    public void showMenu() {
        System.out.println("1. Expresso");
        System.out.println("2. Latte");
        System.out.println("3. Milk");
        System.out.println("4. SoyMilk");
    }

    @Override
    public void addDrinkable(Drinkable drinkable) {
        orders.add(drinkable);
    }

    @Override
    public Integer calculateTotal() {
        int sum = 0;

        for (Drinkable drink : orders) {
            sum = sum + drink.getPrice();
        }

        return sum ;
    }

    @Override
    public void printTicket() {
        System.out.println("Your order: ");
        System.out.println("------------------------");
        orders.forEach(a-> System.out.printf("%s %d" + "\n", a.getName(), a.getPrice() * 2));
            System.out.println(" ");


        System.out.println("------------------------");
        System.out.printf("%20s %d", "Total:", calculateTotal());
    }

}
