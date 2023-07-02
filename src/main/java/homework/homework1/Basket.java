package main.java.homework.homework1;

import java.util.ArrayList;
import java.util.Arrays;


public class Basket{
    private ArrayList<Product> purchasedGoods;

    public Basket(Product[] products) {
        this.purchasedGoods = new ArrayList<>(Arrays.asList(products));
    }
    public Basket() {
        this.purchasedGoods = new ArrayList<>();
    }
    @Override
    public String toString() {
        return "Basket:" + Arrays.toString(purchasedGoods.toArray());
    }
    public ArrayList<Product> getPurchasedGoods() {
        return purchasedGoods;
    }
    public void setPurchasedGoods(ArrayList<Product> purchasedGoods) {
        this.purchasedGoods = purchasedGoods;
    }


    /**
     * @apiNote Метод для добавления товара в корзину, и удаления из списка товаров магазина
     * @param ct Все категории и товары магазина
     * @param prod имя товара который мы хотим добавить в корзину
     */
    public void add(Category[] ct, String prod){
        boolean flag = false;
        ArrayList<Product> pd = new ArrayList<>();
        int count = 0;
        for (Category categ : ct) {
            for (Product entity: categ.getProducts()) {
                if (entity.getName().contains(prod) && count == 0) {
                    flag = true;
                    System.out.println("Товар успешно добавлен в корзину)");
                    this.purchasedGoods.add(entity);
                    count += 1;
                } else {
                    pd.add(entity);
                }
                categ.setProducts(pd.toArray(new Product[pd.size()]));
            }
        }
        if (!flag) System.out.println("Такой категории товаров у нас нет(");
    }

    /**
     * @apiNote Метод для удаления товара из корзины, и добавления в списка товаров магазина
     * @param ct Все категории и товары магазина
     * @param prod имя товара который мы хотим добавить в корзину
     */
    public void delete(Category[] ct, String prod){
        boolean flag = false;
        Product search = new Product();
        ArrayList<Product> f = new ArrayList<>();
        for (Product entity : this.getPurchasedGoods()) {
            for (Category categ: ct) {
                if (entity.getName().contains(prod)) {
                    search = entity;
                    flag = true;
                    System.out.println("Товар успешно удален из корзины)");
                    f = new ArrayList<>(Arrays.asList(categ.getProducts()));
                    break;
                }
            }
        }
        if (!flag) System.out.println("В вашей корзине нет такого товара(");
        else {
            purchasedGoods.remove(search);
            f.add(0, search);
            for (Category en : ct) {
                en.setProducts(f.toArray(new Product[f.size()]));
                break;
            }
        }
    }
}
