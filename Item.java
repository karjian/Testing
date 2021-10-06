package com.tankarjian.it212n.testing;

import androidx.annotation.NonNull;

public class Item {
    // constants to hold reference to drawables (icons) used in the app
    public static final int[] ICONS = {
            R.drawable.burger
    };

    // private members used in the list items....
    private String title;
    private int   image;
    private double price;


    public Item(String title, double price) {
        setTitle(title);
        setPrice(price);
        setImage(R.drawable.burger);

    }

    public void setTitle(String title) {this.title = title; }
    public void setImage(int image) {this.image = image; }
    public void setPrice(double price) {this.price = Math.max(0, price); }



    public String getTitle() {return title;}
    public int getImage() {return image;}
    public double getPrice() {return price;}

    @NonNull
    @Override
    public String toString() {
        return getTitle();
    }
}
