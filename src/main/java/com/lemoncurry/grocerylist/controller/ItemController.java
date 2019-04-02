package com.lemoncurry.grocerylist.controller;

import com.lemoncurry.grocerylist.model.Item;
import com.lemoncurry.grocerylist.service.ItemService;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping(path = { "", "/" })
    public @NotNull Iterable<Item> getItems() {
        return itemService.getAllItems();
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public void addItem(@RequestBody Item item) {
        itemService.save(item);
    }

    @GetMapping("/{id}")
    public Item getItem(@PathVariable Long id) {
        return itemService.getItem(id);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        itemService.deleteById(id);
    }

}
