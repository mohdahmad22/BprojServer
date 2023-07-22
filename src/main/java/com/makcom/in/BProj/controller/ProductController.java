package com.makcom.in.BProj.controller;

import com.makcom.in.BProj.JPA.ProductJpa;
import com.makcom.in.BProj.Product.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/product/{id}")
    public Optional<Product> getProductByID(@PathVariable Integer id){
        return productRepo.findById(id);
    }

}
