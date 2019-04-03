package com.lemoncurry.grocerylist.repository;

import com.lemoncurry.grocerylist.model.GrList;
import org.springframework.data.repository.CrudRepository;

public interface GrListRepository extends CrudRepository<GrList, Long> {
}
