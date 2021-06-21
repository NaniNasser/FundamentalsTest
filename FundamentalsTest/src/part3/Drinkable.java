package part3;

public interface Drinkable {

    String drink();
    String getName();
    Integer getPrice();
    default Integer getTemperature() {
        return 10;
    }

}
