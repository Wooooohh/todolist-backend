package com.ita.todolist.controller;

import com.ita.todolist.entity.Item;
import com.ita.todolist.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @PutMapping("/{id}")
    public Item updateItem(@PathVariable int id,@RequestBody Item item){
        return itemService.updateItem(id, item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable int id){
        itemService.deleteItem(id);
    }

    @PostMapping()
    public Item addItem(@RequestBody Item item){
        return itemService.addItem(item);
    }
}
