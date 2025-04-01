package org.example.model;

public class Bread extends ProductForSale{

    private double priceBread;


    public Bread(String description, double price, String type) {
        super(description, price, type);
    }

    public Bread(String description, double price, String type, double priceBread) {
        super(description, price, type);
        this.priceBread = priceBread;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() +this);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "priceBread=" + priceBread +
                '}';
    }
}
