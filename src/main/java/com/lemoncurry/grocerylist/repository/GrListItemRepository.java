package com.lemoncurry.grocerylist.repository;

import com.lemoncurry.grocerylist.model.GrListItem;
import com.lemoncurry.grocerylist.model.GrListItemPK;
import org.springframework.data.repository.CrudRepository;

public interface GrListItemRepository extends CrudRepository<GrListItem, GrListItemPK> {

}
