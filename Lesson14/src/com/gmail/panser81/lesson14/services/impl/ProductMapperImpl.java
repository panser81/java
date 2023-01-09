package com.gmail.panser81.lesson14.services.impl;

import com.gmail.panser81.lesson14.models.Product;
import com.gmail.panser81.lesson14.services.Mapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductMapperImpl implements Mapper {

    @Override
    public List<Product> map(String productsString) {

        String[] productsLineArray = productsString.split("\n");

        ArrayList<Product> products = new ArrayList<>();

        for (int i = 1; i < productsLineArray.length; i++) {
            String[] productStr = productsLineArray[i].split(";");

            String name = productStr[0];
            String uniqueName = productStr[1];
            BigDecimal price = new BigDecimal(productStr[2]);
            int count = Integer.parseInt(productStr[3]);
            String production = productStr[4];

            Product product = new Product(name, uniqueName, price, count, production);
            products.add(product);
        }

        return products;
    }
}
