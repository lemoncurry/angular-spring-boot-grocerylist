package com.lemoncurry.grocerylist.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "order")
public class GrListItemPK implements Serializable {

    private static final long serialVersionUID = -537205402568700559L;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "GrList_id")
    private GrList grList;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")

    private Item item;

    public GrList getGrList() {
        return grList;
    }

    public void setGrList(GrList grList) {
        this.grList = grList;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((grList.getId() == null)
                ? 0 : grList
                .getId()
                .hashCode());
        result = prime * result + ((item.getId() == null)
                ? 0 : item
                .getId()
                .hashCode());

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
        GrListItemPK other = (GrListItemPK) obj;
        if (grList == null) {
            if (other.grList != null) {
                return false;
            }
        } else if (!grList.equals(other.grList)) {
            return false;
        }

        if (item == null) {
            if (other.item != null) {
                return false;
            }
        } else if (!item.equals(other.item)) {
            return false;
        }

        return true;
    }
}
