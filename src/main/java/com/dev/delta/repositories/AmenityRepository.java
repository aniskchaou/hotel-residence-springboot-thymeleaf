package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Amenity;

public interface AmenityRepository extends JpaRepository<Amenity, Long> {
	Optional<Amenity> findById(int id);
}
