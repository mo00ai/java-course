package chapter3.collection;

public class Product {

    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
