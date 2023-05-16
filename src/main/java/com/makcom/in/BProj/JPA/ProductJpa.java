package com.makcom.in.BProj.JPA;

import com.makcom.in.BProj.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpa extends JpaRepository<Product, Integer> {
}
