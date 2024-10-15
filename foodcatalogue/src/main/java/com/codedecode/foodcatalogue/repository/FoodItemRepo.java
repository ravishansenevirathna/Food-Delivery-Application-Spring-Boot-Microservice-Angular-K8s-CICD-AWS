package com.codedecode.foodcatalogue.repository;

import com.codedecode.foodcatalogue.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepo extends JpaRepository<FoodItem,Integer> {
}
