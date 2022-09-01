package ru.job4j.stream.productservice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .flatMap(Stream::ofNullable)
                .filter(Product -> Product.getStandard() - Product.getActual() <= 3)
                .filter(Product -> Product.getStandard() - Product.getActual() >= 0)
                .map(Product -> new Label(Product.getName(), (Product.getPrice() * 0.5f))
                .toString())
                .collect(Collectors.toList());
    }
}
