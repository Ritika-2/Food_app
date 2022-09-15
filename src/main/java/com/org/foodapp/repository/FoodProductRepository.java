package com.org.foodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.foodapp.dto.Food;

public interface foodRepository extends JpaRepository<Food, Integer> {

}
