package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.CheckIn;

public interface CheckInRepository extends JpaRepository<CheckIn, Long> {
	Optional<CheckIn> findById(int id);
}
