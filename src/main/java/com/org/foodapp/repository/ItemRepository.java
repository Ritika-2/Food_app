package com.org.foodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.foodapp.dto.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
