package com.codedecode.restaurantslisting.repo;

import com.codedecode.restaurantslisting.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant,Integer> {
}
