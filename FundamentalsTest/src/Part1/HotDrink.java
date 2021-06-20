package Part1;

import Part1.part2.Expresso;

public class HotDrink {
    private Integer price;
    private Integer temperature;
    private String name;



    public HotDrink(Integer price, Integer temperature, String name) {
        this.name = name;
        this.price = price;
        this.temperature = temperature;
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
