package com.lemoncurry.grocerylist.dto;

import com.lemoncurry.grocerylist.model.Item;

public class GrListItemDto {
    private Item item;
    private Integer quantity;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
