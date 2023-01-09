package com.gmail.panser81.lesson14.services;

import com.gmail.panser81.lesson14.models.Product;

import java.util.List;

public interface Mapper {
    List<Product> map(String productsString);
}
