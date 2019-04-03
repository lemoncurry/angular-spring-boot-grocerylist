package com.lemoncurry.grocerylist.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "gr_list")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="grlistItems")
public class GrList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd") private LocalDate dateCreated;

    private String shop;

    @OneToMany(mappedBy = "pk.order")
    @Valid
    private List<GrListItem> grListItems = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public List<GrListItem> getGrListItems() {
        return grListItems;
    }

    public void setGrListItems(List<GrListItem> grListItem) {
        this.grListItems = grListItem;
    }

    @Transient
    public int getNumberOfItems() {
        return this.grListItems.size();
    }
}
