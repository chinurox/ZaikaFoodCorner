package com.example.gargc.zaikafoodcorner.Model;


public class Category {

    private String Name;

    public Category(String name, String image) {
        Name = name;
        Image = image;
    }

    public Category() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    private String Image;

}
