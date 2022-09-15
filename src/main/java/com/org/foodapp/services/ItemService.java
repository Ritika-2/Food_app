package com.org.foodapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.org.foodapp.dao.ItemDao;
import com.org.foodapp.dto.Item;

@Service
public class ItemService {

	@Autowired
	ItemDao itemDao;
	public Item saveItem(@RequestBody Item item) {
		return itemDao.saveItem(item);
	}
	
	public Item updateItem(@RequestBody Item item) {
		return itemDao.updateItem(item);
	}
	
	public List<Item> getAllItems(){
		return itemDao.getAllItems();
	}
	
	public Item getItemById( int id) {
		return itemDao.getItemById(id);
	}
	
	public String deleteItem( int id) {
		return itemDao.deleteItem(id);
	}
}
