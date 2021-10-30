package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.ExtraBedRequestOrder;

public interface ExtraBedOrderRepository  extends JpaRepository<ExtraBedRequestOrder, Long>{

}
