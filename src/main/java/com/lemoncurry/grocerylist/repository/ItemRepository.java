package com.lemoncurry.grocerylist.repository;

import com.lemoncurry.grocerylist.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
