package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {

}
