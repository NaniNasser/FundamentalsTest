package Part1;

public class ColdDrink {
    String name;
    Integer price;

    public ColdDrink(String name, Integer price){
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ColdDrink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public boolean nameEquals(String name){
        return name.equals(this.name);
    }
}
