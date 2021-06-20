package part4;

import part3.Drinkable;

public interface Bartender {
    void showMenu();
    void addDrinkable(Drinkable drink);
    Integer calculateTotal();
    void printTicket();
}
