package com.example.demo.Repository;

import com.example.demo.Model.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemsRepository  extends JpaRepository<OrderItems,Integer> {
}
