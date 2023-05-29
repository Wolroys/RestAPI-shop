package com.wolroys.controllers;

import com.wolroys.model.entities.Item;
import com.wolroys.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequiredArgsConstructor
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
}
