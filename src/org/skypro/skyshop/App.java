package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;
public class App {
    public static void main(String[] args) {
        ProductBasket productBasket = new ProductBasket();
        Product product1 = new Product("Хлеб", 50);
        Product product2 = new Product("Молоко", 60);
        Product product3 = new Product("Колбаса", 200);
        Product product4 = new Product("Сыр", 150);
        Product product5 = new Product("Майонез", 100);

        productBasket.addProduct(product1);
        productBasket.addProduct(product2);
        productBasket.addProduct(product3);
        productBasket.addProduct(product4);
        productBasket.addProduct(product5);

        System.out.println("Корзина");
        productBasket.printProductBasket();

        System.out.println(("Есть ли хлеб в корзине? " + productBasket.hasProduct("хлеб")));

        productBasket.clear();
        productBasket.printProductBasket();
    }

}