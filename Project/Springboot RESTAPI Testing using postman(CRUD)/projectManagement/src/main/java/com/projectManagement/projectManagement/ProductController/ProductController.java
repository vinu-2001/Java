package com.projectManagement.projectManagement.ProductController;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

import com.projectManagement.projectManagement.ProductService.ProductService;
import com.projectManagement.projectManagement.model.Product;
 
@RestController
public class ProductController {
 
    @Autowired
    private ProductService service;
 // RESTful API methods for Retrieval operations
    @GetMapping("/products")
public List<Product> list() {
    return service.listAll();
}
 // RESTful API methods for Add operations
    @PostMapping("/products")
    public void add(@RequestBody Product product) {
        service.save(product);
    }
 // RESTful API methods for Retrieval operations using ID
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> get(@PathVariable Integer id) {
        try {
            Product product = service.get(id);
            return new ResponseEntity<Product>(product, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }      
    }
 // RESTful API methods for update operations
    @PutMapping("/products/{id}")
    public ResponseEntity<?> update(@RequestBody Product product, @PathVariable Integer id) {
        try {
            Product existProduct = service.get(id);
            service.save(product);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
 // RESTful API methods for Delete operations
    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
