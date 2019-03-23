package com.patterns.builder;

import com.patterns.builder.objects.Product;

/**
 * Created by Sahatov Batyr on 23.03.2019.
 */
public class Runner {

    public static void main( String[] args ){

        Product product = new Product.Builder()
                .setId(1L)
                .setName("car")
                .setUnitId(1L)
                .setProductCategoryId(1L)
                .setBarcode(12345L)
                .build();

    }

}
