package part6;

import part2.Expresso;

public class Main {
    public static void main(String[] args) {
BistroBartender bistroBartender = new BistroBartender();

        bistroBartender.addDrinkable(new Expresso());
        bistroBartender.addDrinkable(new Expresso());
        bistroBartender.addDrinkable(new Expresso());
        bistroBartender.addDrinkable(new Expresso());
        bistroBartender.addDrinkable(new Expresso());
        bistroBartender.addDrinkable(new Expresso());

        bistroBartender.calculateTotal();

        bistroBartender.printTicket();

    }
}
