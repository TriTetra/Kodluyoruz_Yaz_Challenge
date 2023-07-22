package ThirdWeek.Hard;

import java.util.Random;

public class product {
    private String name;
    private Integer id;
    private Integer price;
    private Integer cost;

    public product(String name, Integer id, Integer price, Integer cost){
        this.name = name;
        this.id = id;
        this.price = price;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getCost() {
        return cost;
    }
}
