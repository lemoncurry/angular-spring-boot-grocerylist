package com.lemoncurry.grocerylist.service;

import com.lemoncurry.grocerylist.exceptions.ItemNotFoundException;
import com.lemoncurry.grocerylist.model.Item;
import com.lemoncurry.grocerylist.repository.ItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public @NotNull Iterable<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItem(long id) {
        return itemRepository
                .findById(id)
                .orElseThrow(() -> new ItemNotFoundException("Artikel konnte nicht gefunden werden."));
    }

    @Override
    public void save(Item item) {
        itemRepository.save(item);
    }

    @Override
    public void deleteById(Long id) {
        itemRepository.deleteById(id);
    }
}
