package com.ita.todolist.service;

import com.ita.todolist.entity.Item;
import java.util.List;

public interface ItemService {

    Item updateItem(int id, Item item);

    List<Item> getAllItems();

    void  deleteItem(int id);

    Item addItem(Item item);
}
