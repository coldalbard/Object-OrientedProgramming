package main.java.homework.homework1;

public class Product{
    protected String name;
    protected Integer price;
    protected Integer rating;

    public Product(String name, Integer price, Integer rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public Product() {
    }
    @Override
    public String toString() {
        return "\nname='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getRating() {
        return rating;
    }
    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
