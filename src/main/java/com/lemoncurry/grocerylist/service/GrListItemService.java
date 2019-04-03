package com.lemoncurry.grocerylist.service;

import com.lemoncurry.grocerylist.model.GrListItem;

import javax.validation.constraints.NotNull;
import javax.validation.Valid;

public interface GrListItemService {
    GrListItem create(@NotNull(message = "The products for order cannot be null.") @Valid GrListItem grListItem);
}
