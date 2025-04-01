package org.example.model;

public class Chocolate extends ProductForSale{

    private double priceChocolate;

    public Chocolate(String description, double price, String type) {
        super(description, price, type);
    }

    public Chocolate(String description, double price, String type, double priceChocolate) {
        super(description, price, type);
        this.priceChocolate = priceChocolate;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);

    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "priceChocolate=" + priceChocolate +
                '}';
    }
}
