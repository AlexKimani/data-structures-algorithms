package com.kimani.data.interfaces;

import com.kimani.data.models.Product;
import lombok.NonNull;

import java.util.List;

public interface CollectorsInterface {
    Integer getSumUsingSummingInt(@NonNull List<Product> products);

    Integer getSumUsingMapToIntInt(@NonNull List<Product> products);

    Double getSumUsingSummingDouble(@NonNull List<Product> products);

    Double getSumUsingMapToDouble(@NonNull List<Product> products);

    Long getSumUsingSummingLong(@NonNull List<Product> products);

    Long getSumUsingMapToLong(@NonNull List<Product> products);
}
