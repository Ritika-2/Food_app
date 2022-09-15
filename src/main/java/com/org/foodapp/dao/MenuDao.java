package com.org.foodapp.dao;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.foodapp.dto.Menu;
import com.org.foodapp.repository.MenuRepository;

@Repository
public class MenuDao {
	@Autowired
	MenuRepository menuRepository;
	public Menu saveMenu(Menu menu)
	{
		return menuRepository.save(menu);
	}
	public Menu updateMenu(Menu menu) {
		return menuRepository.save(menu);
	}
	
	public List<Menu> getAllMenu(){
		return menuRepository.findAll();
	}
	
	public Menu getMenuById(int id){
		Optional<Menu> found =	menuRepository.findById(id);
		if(found.isPresent()) {
			return found.get();
		}else {
			return null;
		}
	
	}
	
	public String deleteMenu(int id) {
		Menu menu = getMenuById(id);
		if(menu != null) {
			menuRepository.delete(menu);
			return menu.getId() + "Food item is deleted";
		}else {
			return  "No Food item is available with specified ID";
		}
	}
}
