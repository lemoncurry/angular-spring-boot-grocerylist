package com.lemoncurry.grocerylist.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;

    @NotNull(message = "Artikel muss eingegeben werden.")
    @Basic(optional = false)
    private String name;

    private int quantity;
    private String category;

    public Item(@NotNull(message = "Artikel muss eingegeben werden.") String name, String category) {
        this.name = name;
        this.quantity = 1;
        this.category = category;
    }

    public Item() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
