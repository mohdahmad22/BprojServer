package com.makcom.in.BProj.controller;

import com.makcom.in.BProj.JPA.OrderJpa;
import com.makcom.in.BProj.Order.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {
private OrderJpa orderRepo;

    public OrderController(OrderJpa orderRepo) {
        this.orderRepo = orderRepo;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/order")
    public List<Order> getOrder(){
        return orderRepo.findAll();
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/order")
    public void saveOrder(@RequestBody Order order){ orderRepo.save(order);}

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/order/{id}")
    public void deleteOrder(@PathVariable Integer id){
        orderRepo.deleteById(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/order/{id}")
    public Optional<Order> getOrderByID(@PathVariable Integer id){
        return orderRepo.findById(id);
    }

}
