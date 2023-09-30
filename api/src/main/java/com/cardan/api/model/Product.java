package com.cardan.api.model;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Product {

    private int id;

    private int qty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
