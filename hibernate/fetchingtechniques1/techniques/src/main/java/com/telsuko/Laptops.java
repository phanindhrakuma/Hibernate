package com.telsuko;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Laptops {
    @Id
    private int lid;
    private String brand;
    private int price;

    @ManyToOne
    private Aliens aliens;

    public int getLid() {
        return lid;
    }


    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    public Aliens getAliens() {
        return aliens;
    }


    public void setAliens(Aliens aliens) {
        this.aliens = aliens;
    }


    @Override
    public String toString() {
        return "Laptops [lid=" + lid + ", brand=" + brand + ", price=" + price + ", aliens=" + aliens + "]";
    }

    
}
