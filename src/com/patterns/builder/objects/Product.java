package com.patterns.builder.objects;

/**
 * Created by Sahatov Batyr on 23.03.2019.
 */

public class Product {
    private final Long  id;
    private final String name;
    private final Long productCategoryId;
    private final Long unitId;
    private final Long barcode;

    private Product( Builder builder ){
        this.id = builder.id;
        this.barcode = builder.barcode;
        this.name= builder.name;
        this.productCategoryId = builder.productCategoryId;
        this.unitId = builder.unitId;

    }



    public static class Builder{

        private Long id;
        private String name;
        private Long productCategoryId;
        private Long unitId;
        private Long barcode;



        public  Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setProductCategoryId(Long productCategoryId) {
            this.productCategoryId = productCategoryId;
            return this;
        }

        public Builder setUnitId(Long unitId) {
            this.unitId = unitId;
            return this;
        }

        public Builder setBarcode(Long barcode) {
            this.barcode = barcode;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }


}
