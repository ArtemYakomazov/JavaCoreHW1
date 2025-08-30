package org.skypro.skyshop.product;

public record Product(String name, int price) {

    public String toString() {
        return name + ": " + price;
    }
}
