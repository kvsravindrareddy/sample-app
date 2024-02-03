package com.veera.product;

public class Product {

    public Product() {

    }

    public Product(int id, String name, String category, double price, String description, boolean isActive, char deleted) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
        this.isActive = isActive;
        this.deleted = deleted;
    }

    private int id;//123
    private String name;//MAC
    private String category;//COMPUTERS, GAMING
    private double price;//1500.23$
    private String description;
    private boolean isActive;//true/false
    private char deleted;//y/n

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public char getDeleted() {
        return deleted;
    }

    public void setDeleted(char deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", isActive=" + isActive +
                ", deleted=" + deleted +
                '}';
    }
}
