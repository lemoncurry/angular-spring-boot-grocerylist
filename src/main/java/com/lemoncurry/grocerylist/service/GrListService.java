package com.lemoncurry.grocerylist.service;

import com.lemoncurry.grocerylist.model.GrList;

import javax.validation.constraints.NotNull;
import javax.validation.Valid;

public interface GrListService {
    @NotNull Iterable<GrList> getAllGrLists();

    GrList create(@Valid GrList grList);

    void update(@Valid GrList grList);
}
