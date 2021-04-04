package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        if (index >= products.length) {
            return products;
        } else {
            int i = (index == 0) ? index : index - 1;
            for (; i < products.length - 1; i++) {
                products[i] = products[i + 1];
            }
            products[products.length - 1] = null;
            return products;
        }
    }
}
