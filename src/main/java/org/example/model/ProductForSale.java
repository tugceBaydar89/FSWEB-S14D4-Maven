package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class ProductForSale {

private String type;
private double price;
private String description;

   // List<String> listProducts =new ArrayList<>();

    public ProductForSale(String description, double price, String type) {
        this.description = description;
        this.price = price;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }



    public double getSalesPrice (int quantity){
        return quantity*price;
    }

    public abstract void showDetails ();

    @Override
    public String toString() {
        return "ProductForSale{" +
                "description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
