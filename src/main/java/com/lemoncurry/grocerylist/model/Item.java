package com.lemoncurry.grocerylist.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Artikel muss eingegeben werden.")
    @Basic(optional = false)
    private String name;

    private Double price;

    public Item(Long id, @NotNull(message = "Artikel muss eingegeben werden.") String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
