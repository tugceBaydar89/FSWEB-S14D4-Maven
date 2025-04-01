package org.example.model;

public class Coke extends ProductForSale{

    private double priceCoke;

    public Coke(String description, double price, String type) {
        super(description, price, type);
    }

    public Coke(String description, double price, String type, double priceCoke) {
        super(description, price, type);
        this.priceCoke = priceCoke;
    }

    @Override
    public void showDetails() {
        System.out.println(this.toString() + this);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "priceCoke=" + priceCoke +
                '}';
    }
}
