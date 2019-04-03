package com.lemoncurry.grocerylist.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class GrListItem {

    @EmbeddedId
    @JsonIgnore
    private GrListItemPK pk;

    @Column(nullable = false) private Integer quantity;

    public GrListItem() {
        super();
    }

    public GrListItem(GrList grList, Item item, Integer quantity) {
        pk = new GrListItemPK();
        pk.setGrList(grList);
        pk.setItem(item);
        this.quantity = quantity;
    }

    @Transient
    public Item getItem() {
        return this.pk.getItem();
    }

    public GrListItemPK getPk() {
        return pk;
    }

    public void setPk(GrListItemPK pk) {
        this.pk = pk;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        GrListItem other = (GrListItem) obj;
        if (pk == null) {
            if (other.pk != null) {
                return false;
            }
        } else if (!pk.equals(other.pk)) {
            return false;
        }

        return true;
    }
}
