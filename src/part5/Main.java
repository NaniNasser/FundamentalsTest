package part5;

import part2.Expresso;

public class Main {
    public static void main(String[] args) {

        CafeBartender cafeBartender = new CafeBartender();

        cafeBartender.showMenu();

        cafeBartender.addDrinkable(new Expresso());
        cafeBartender.addDrinkable(new Expresso());
        cafeBartender.addDrinkable(new Expresso());

        cafeBartender.calculateTotal();

        cafeBartender.printTicket();


    }
}
