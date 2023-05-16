package com.makcom.in.BProj.JPA;

import com.makcom.in.BProj.Order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJpa extends JpaRepository<Order,Integer>{
}
