package com.wolroys.controllers;

import com.wolroys.entities.Item;
import com.wolroys.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> index(){
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public Item showItem(@PathVariable("id") int id){
        return itemService.getItem(id).orElse(null);
    }

    @PostMapping
    public void saveNewItem(@RequestBody Item item){
        itemService.addItem(item);
    }

    @PutMapping
    public void updateItem(@RequestBody Item updatedItem){
        itemService.update(updatedItem);
    }
}
