package part5;

import part3.Drinkable;
import part4.Bartender;

import java.util.*;

public class CafeBartender implements Bartender {

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

        return sum * 2;
    }

    @Override
    public void printTicket() {

        Collections.sort(orders, Comparator.comparing(Drinkable::getName));

        for (int i = 0; i < orders.size(); i++) {
            Drinkable drink = orders.get(i);
            System.out.printf("%s %d", drink.getName(), drink.getPrice() * 2);
        }

        System.out.println("------------------------");
        System.out.printf("%20s %d", "Total:", calculateTotal());
    }

}

