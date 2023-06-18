package com.wsjsistema.wsjdscommerce.repositories;

import com.wsjsistema.wsjdscommerce.entities.OrderItem;
import com.wsjsistema.wsjdscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
