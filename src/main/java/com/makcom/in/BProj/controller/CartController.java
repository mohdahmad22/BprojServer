package com.makcom.in.BProj.controller;

import com.makcom.in.BProj.Cart.Cart;
import com.makcom.in.BProj.JPA.CartJpa;
import com.makcom.in.BProj.Order.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CartController {
    private CartJpa cartRepo;

    public CartController(CartJpa cartRepo) {
        this.cartRepo = cartRepo;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/cart")
    public List<Cart> getCartdata(){
        return  cartRepo.findAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/cart")
    public void saveData(@RequestBody Cart cart){
        cartRepo.save(cart);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/cart/{id}")
    public void deleteCart(@PathVariable Integer id){
        cartRepo.deleteById(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/cart/{id}")
    public Optional<Cart> getCartByID(@PathVariable Integer id){
        return cartRepo.findById(id);
    }


}
