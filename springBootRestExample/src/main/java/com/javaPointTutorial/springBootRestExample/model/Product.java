package com.javaPointTutorial.springBootRestExample.model;

public class Product {
    private int id;
    private String pName;
    private String batchNo;
    private double price;
    private int noofProduct;

    public Product() {
    }

    public Product(int id, String pName, String batchNo, double price, int noofProduct) {
        this.id = id;
        this.pName = pName;
        this.batchNo = batchNo;
        this.price = price;
        this.noofProduct = noofProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNoofProduct() {
        return noofProduct;
    }

    public void setNoofProduct(int noofProduct) {
        this.noofProduct = noofProduct;
    }
}
