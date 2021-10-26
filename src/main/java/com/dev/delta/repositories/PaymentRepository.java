package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
	Optional<Payment> findById(Long id);
}
