package Part1;

public class HotDrink {
    Integer price;
    Integer temperature;
    String name;


    public void HotDrinkDefault(Integer price, Integer temperature, String name) {
        this.name = name;
        this.price = price;
        this.temperature = temperature;
    }

    public HotDrink(Integer price, Integer temperature, String name) {
        this.name = "tea";
        this.price = 2;
        this.temperature = 75;
    }



    public Integer getTemperature() {
        return temperature;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer calcPrice(Integer price){
        return this.price = price;
    }


    @Override
    public String toString() {
        return "HotDrink{" +
                "price=" + price +
                ", temperature=" + temperature +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean nameEquals(String name){
        return name.equals(this.name);
    }
}
