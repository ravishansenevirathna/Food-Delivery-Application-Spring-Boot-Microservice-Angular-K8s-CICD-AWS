package com.codedecode.foodcatalogue.service;

import com.codedecode.foodcatalogue.repository.FoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodCatalogueService {
    @Autowired
    FoodItemRepo foodItemRepo;
}
