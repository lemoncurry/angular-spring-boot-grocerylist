package com.lemoncurry.grocerylist.service;

import com.lemoncurry.grocerylist.model.GrList;
import com.lemoncurry.grocerylist.repository.GrListRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Service
@Transactional
public class GrListServiceImpl implements GrListService {

    private GrListRepository grListRepository;

    public GrListServiceImpl(GrListRepository grListRepository) {
        this.grListRepository = grListRepository;
    }

    @Override
    public @NotNull Iterable<GrList> getAllGrLists() {
        return this.grListRepository.findAll();
    }

    @Override
    public GrList create(@Valid GrList grList) {
        grList.setDateCreated(LocalDate.now());

        return this.grListRepository.save(grList);
    }

    @Override
    public void update(@Valid GrList grList) {
        this.grListRepository.save(grList);
    }
}
