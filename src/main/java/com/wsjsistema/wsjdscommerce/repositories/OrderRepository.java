package com.wsjsistema.wsjdscommerce.repositories;

import com.wsjsistema.wsjdscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
