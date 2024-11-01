//package com.example.d1023.controller;
//
//import com.example.d1023.entity.Product;
//import com.example.d1023.repository.ProductRepository;
//import com.example.d1023.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/products")
//public class ProductController {
//
//    @Autowired
//    private ProductService productService;
//    @PostMapping
//    public Product createProduct(@RequestBody Product product){
//        return productService.saveProduct(product);
//    }
//
//    @GetMapping
//    public Iterable<Product> getAllProduct() {
//        return productService.getAllProducts();
//    }
//
//    @GetMapping("/{id}")
//    public Product getProductById(@PathVariable String id) {
//        return productService.getProductById(id);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteProduct(@PathVariable String id) {
//        productService.deleteProduct(id);
//    }
//}
