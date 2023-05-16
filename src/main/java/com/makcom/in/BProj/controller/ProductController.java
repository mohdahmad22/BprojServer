package com.makcom.in.BProj.controller;

import com.makcom.in.BProj.JPA.ProductJpa;
import com.makcom.in.BProj.Product.Product;
import com.makcom.in.BProj.User.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductJpa productRepo;

    public ProductController(ProductJpa productRepo) {
        this.productRepo = productRepo;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/product")
    public List<Product> getProduct() {
        return productRepo.findAll();
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/product")
    public void saveProduct(@RequestBody Product product){
        productRepo.save(product);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable Integer id){
        productRepo.deleteById(id);
    }

}
