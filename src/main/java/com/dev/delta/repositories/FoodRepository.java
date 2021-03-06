package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
	Optional<Food> findById(int id);
}
