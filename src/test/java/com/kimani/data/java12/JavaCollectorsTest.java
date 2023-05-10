package com.kimani.data.java12;

import com.kimani.data.models.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaCollectorsTest {
    private List<Product> products;
    private Integer expectedIntSumValue;
    private Double expectedDoubleSumValue;
    private Long expectedLongSumValue;
    private JavaCollectors javaCollectors;

    @BeforeEach
    void setUp() {
        this.products = Arrays.asList(
                new Product("Milk", 37, 3.60, 12345600L),
                new Product("Carton of Eggs", 50, 1.20, 12378300L),
                new Product("Olive oil", 28, 37.0, 13412300L),
                new Product("Peanut butter", 33, 4.19, 15121200L),
                new Product("Bag of rice", 26, 1.70, 21401265L)
        );
        expectedIntSumValue = products.stream().mapToInt(Product::getQuantity).sum();
        expectedDoubleSumValue = products.stream().mapToDouble(Product::getPrice).sum();
        expectedLongSumValue = products.stream().mapToLong(Product::getProductNumber).sum();
        javaCollectors = new JavaCollectors();
    }

    @AfterEach
    void tearDown() {
        this.products = null;
        expectedDoubleSumValue = 0.0;
        expectedIntSumValue = 0;
        expectedLongSumValue = 0L;
    }

    @Test
    void getSumUsingSummingInt() {
        assertNotNull(products);
        assertEquals(expectedIntSumValue, javaCollectors.getSumUsingSummingInt(products));
    }

    @Test
    void getSumUsingMapToIntInt() {
        assertNotNull(products);
        assertEquals(expectedIntSumValue, javaCollectors.getSumUsingMapToIntInt(products));
    }

    @Test
    void getSumUsingSummingDouble() {
        assertNotNull(products);
        assertEquals(expectedDoubleSumValue, javaCollectors.getSumUsingSummingDouble(products));
    }

    @Test
    void getSumUsingMapToDouble() {
        assertNotNull(products);
        assertEquals(expectedDoubleSumValue, javaCollectors.getSumUsingMapToDouble(products));
    }

    @Test
    void getSumUsingSummingLong() {
        assertNotNull(products);
        assertEquals(expectedLongSumValue, javaCollectors.getSumUsingSummingLong(products));
    }

    @Test
    void getSumUsingMapToLong() {
        assertNotNull(products);
        assertEquals(expectedLongSumValue, javaCollectors.getSumUsingMapToLong(products));
    }
}