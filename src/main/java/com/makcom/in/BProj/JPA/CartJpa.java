package com.makcom.in.BProj.JPA;

import com.makcom.in.BProj.Cart.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartJpa extends JpaRepository<Cart, Integer> {
}

