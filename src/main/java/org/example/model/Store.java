package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static void main(String[] args) {

    ProductForSale [] products = new ProductForSale[5];
    products [0] =new Chocolate("diet",5,"sugar");
    products [1] = new Bread("diet",5,"whole");
    products [2] = new Coke("diet",5,"no-sugar");

    listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }
    }
}