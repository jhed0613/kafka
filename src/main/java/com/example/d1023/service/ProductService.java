//package com.example.d1023.service;
//
//import com.example.d1023.entity.Product;
//import com.example.d1023.repository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ProductService {
//    @Autowired
//    private ProductRepository productRepository;
//
//    public Product saveProduct(Product product){
//        return productRepository.save(product);
//    }
//
//    public Iterable<Product> getAllProducts() {
//        return productRepository.findAll();
//    }
//
//    public Product getProductById(String id) {
//        return productRepository.findById(id).orElse(null);
//    }
//
//    public void deleteProduct(String id) {
//        productRepository.deleteById(id);
//    }
//}
