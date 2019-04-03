package com.lemoncurry.grocerylist.service;

import com.lemoncurry.grocerylist.model.GrListItem;
import com.lemoncurry.grocerylist.repository.GrListItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Service
@Transactional
public class GrListItemServiceImpl implements GrListItemService {

    private GrListItemRepository grListItemRepository;

    public GrListItemServiceImpl(GrListItemRepository grListItemRepository) {
        this.grListItemRepository = grListItemRepository;
    }

    @Override
    public GrListItem create(@NotNull(message = "The products for order cannot be null.") @Valid GrListItem grListItem) {
        return this.grListItemRepository.save(grListItem);
    }
}
