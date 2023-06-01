package com.wolroys.services;


import com.wolroys.entities.Item;
import com.wolroys.repositories.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@Transactional(readOnly = true)
public class ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    public Optional<Item> getItem(long id){
        return itemRepository.findById(id);
    }

    @Transactional
    public void addItem(Item item){
        item.setCreatedAt(LocalDateTime.now());
        itemRepository.save(item);
    }

    @Transactional
    public void update(Item updatedItem){
        updatedItem.setUpdatedAt(LocalDateTime.now());
        itemRepository.save(updatedItem);
    }
}
