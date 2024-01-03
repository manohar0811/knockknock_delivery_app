package com.example.knockknock.Models;

public class mainmodel {
    int image;
    String itemname,itemprice,itemdescription;

    public mainmodel(int image, String itemname, String itemprice, String itemdescription) {

        this.image = image;
        this.itemname = itemname;
        this.itemprice = itemprice;
        this.itemdescription = itemdescription;
    }

    public int getImage() {
        return image;
    }

    public String getItemname() {
        return itemname;
    }

    public String getItemprice() {
        return itemprice;
    }

    public String getItemdescription() {
        return itemdescription;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public void setItemprice(String itemprice) {
        this.itemprice = itemprice;
    }

    public void setItemdescription(String itemdescription) {
        this.itemdescription = itemdescription;
    }
}
