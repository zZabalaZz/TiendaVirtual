package com.cristianzabala.tiendavirtual;

public class Product {

    private String name;

    private String description;


    private Double price;

    public Product(String name, String description, double price, String urlImage) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.urlImage = urlImage;
    }

    private String urlImage;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }


    public Product(){

    }



}

