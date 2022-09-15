package com.org.foodapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.foodapp.dao.MenuDao;
import com.org.foodapp.dto.Menu;



@Service
public class MenuService {
	@Autowired
	MenuDao menuDao;
	
	public Menu saveMenu(Menu menu) {
		return menuDao.saveMenu(menu);
	}
	
	public Menu updateMenu(Menu menu) {
		return menuDao.updateMenu(menu);
	}
	public List<Menu> getAllMenu(){
		return menuDao.getAllMenu();
	}
	public Menu getMenuById(int id) {
		return menuDao.getMenuById(id);
	}
	public String deleteMenu(int id) {
		return menuDao.deleteMenu(id);
	}
	

}
