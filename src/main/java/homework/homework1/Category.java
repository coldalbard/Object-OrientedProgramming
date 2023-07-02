package main.java.homework.homework1;


import java.util.Arrays;

public class Category{
    protected String categoryName;
    protected Product[] products = new Product[3];

    public Category(String categoryName, Product[] products) {
        this.categoryName = categoryName;
        this.products = products;
    }
    public Category() {
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public Product[] getProducts() {
        return products;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    @Override
    public String toString() {
        return "\nCategory name: " + this.categoryName + ", Products: " + Arrays.toString(this.products)+ "\n";
    }
}
