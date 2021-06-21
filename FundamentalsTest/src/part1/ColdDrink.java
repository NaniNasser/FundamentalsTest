package part1;

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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ColdDrink) {
            ColdDrink other = (ColdDrink) obj;
            return this.name.equals(other.name);
        }
        return false;
    }

}
