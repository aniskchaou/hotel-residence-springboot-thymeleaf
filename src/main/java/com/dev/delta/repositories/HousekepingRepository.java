package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Housekeping;

public interface HousekepingRepository extends JpaRepository<Housekeping, Long> {
	Optional<Housekeping> findById(int id);
}
