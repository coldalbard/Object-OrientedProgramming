package main.java.homework.homework1;

import java.util.Arrays;

public class Shop {
    private String shopName;
    private Integer countProducts;
    private Category[] categories;


    public Shop(Category[] categories) {
        this("Лента", categories);
    }
    public Shop(String shopName, Category[] categories) {
        this.shopName = shopName;
        int countProducts = 0;
        for (Category categ: categories) {
            for (Product pr : categ.getProducts()) {
                countProducts += 1;
            }
        }
        this.countProducts = countProducts;
        this.categories = categories;
    }

    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public Integer getCountProducts() {
        return countProducts;
    }
    public void setCountProducts(Integer countProducts) {
        this.countProducts = countProducts;
    }

    /**
     * @apiNote Метод для увеличивания количества товаров в магазине
     */
    public void add(){
        this.countProducts = this.countProducts + 1;
    }

    /**
     * @apiNote Метод для уменьшения количества товаров в магазине
     */
    public void delete(){
        this.countProducts = this.countProducts - 1;
    }
    @Override
    public String toString() {
        return "shopName='" + shopName + '\'' +
                ", countProducts=" + countProducts +
                ", categories=" + Arrays.toString(categories);
    }
}
