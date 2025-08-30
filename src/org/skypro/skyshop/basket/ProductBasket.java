package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {
    private final Product[] products;
    private int size;

    public ProductBasket() {
        this.products = new Product[5];
        this.size = 0;
    }

    public void addProduct(Product product) {
        if (size < products.length) {
            products[size] = product;
            size++;
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }

    public int getTotalPrice() {
        int total = 0;
        for (Product product : products) {
            if (product != null) {
                total += product.price();
            }
        }
        return total;
    }

    public void printProductBasket() {
        for (Product product : products) {
            if (product != null) {
                System.out.println(product);
            } else if (size == 0) {
                System.out.println("в корзине пусто");
                return;
            }
        }
        System.out.println("Итого: " + getTotalPrice());
    }

    public boolean hasProduct(String name) {
        for (Product product : products) {
            if (product.name().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(products, null);
    }
}
