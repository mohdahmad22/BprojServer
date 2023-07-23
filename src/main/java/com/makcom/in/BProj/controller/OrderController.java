package com.makcom.in.BProj.controller;

import com.makcom.in.BProj.JPA.OrderJpa;
import com.makcom.in.BProj.Order.Order;
import com.makcom.in.BProj.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {
private final OrderJpa orderRepo;
@Autowired
    OrderService service;

    public OrderController(OrderJpa orderRepo) {
        this.orderRepo = orderRepo;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/orders")
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
    @GetMapping("/order")
    public ResponseEntity<List<Order>> getOrderPageWise(@RequestParam(defaultValue = "0") Integer pageNo,@RequestParam(defaultValue = "10") Integer pageSize){
       List<Order> list = service.getAllOrder(pageNo,pageSize);
       return new ResponseEntity<List<Order>>(list,new HttpHeaders(), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/order/{id}")
    public Optional<Order> getOrderByID(@PathVariable Integer id){
        return orderRepo.findById(id);
    }

}
