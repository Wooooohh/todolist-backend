package com.ita.todolist.service;


import com.ita.todolist.entity.Item;
import com.ita.todolist.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    ItemRepository itemRepository;

    @Override
    public Item updateItem(int id, Item item){
        try {
            itemRepository.findById(id).orElseThrow(Exception::new);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return itemRepository.save(item);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public void deleteItem(int id) {
        try {
            itemRepository.findById(id).orElseThrow(Exception::new);
        } catch (Exception e) {
            e.printStackTrace();
        }
        itemRepository.deleteById(id);
    }

    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }
}
