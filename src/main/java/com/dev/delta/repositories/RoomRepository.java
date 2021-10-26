package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Room;

public interface RoomRepository extends JpaRepository<Room, Long>  {
	Optional<Room> findById(Long id);
}
