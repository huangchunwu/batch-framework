package com.hcw.core.batch;

/**
 * Created by huangchunwu on 2019/1/10.
 */
public class Product
{
    private String id;
    private String name;
    private String description;
    private String quantity;
    public Product() {
    }
    public Product(String id, String name, String description, String quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
