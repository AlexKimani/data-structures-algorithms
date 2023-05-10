package com.kimani.data.java12;

import com.kimani.data.interfaces.CollectorsInterface;
import com.kimani.data.models.Product;
import lombok.NonNull;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This class seeks to show implementations of the Java Collectors class in java 11, 12, 15 & 17
 */
public class JavaCollectors implements CollectorsInterface {
    @Override
    public Integer getSumUsingSummingInt(List<Product> products) {
        return products.stream().collect(Collectors.summingInt(Product::getQuantity));
    }

    @Override
    public Integer getSumUsingMapToIntInt(List<Product> products) {
        return products.stream().mapToInt(Product::getQuantity).sum();
    }

    /**
     * @param products
     * @return
     */
    @Override
    public Double getSumUsingSummingDouble(@NonNull List<Product> products) {
        return products.stream().collect(Collectors.summingDouble(Product::getPrice));
    }

    /**
     * @param products
     * @return
     */
    @Override
    public Double getSumUsingMapToDouble(@NonNull List<Product> products) {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    /**
     * @param products
     * @return
     */
    @Override
    public Long getSumUsingSummingLong(@NonNull List<Product> products) {
        return products.stream().collect(Collectors.summingLong(Product::getProductNumber));
    }

    /**
     * @param products
     * @return
     */
    @Override
    public Long getSumUsingMapToLong(@NonNull List<Product> products) {
        return products.stream().mapToLong(Product::getProductNumber).sum();
    }
}
