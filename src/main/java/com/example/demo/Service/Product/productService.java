package com.example.demo.Service.Product;

import com.example.demo.DTO.UserDto;
import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productService  implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public String productSave(Product product) {
        try {
            Product savedProduct = productRepository.save(product);
            if (savedProduct != null) {
                return "Product saved successfully with ID: " + savedProduct.getId();
            } else {
                return "Product not saved.";
            }
        } catch (Exception e) {
            // Log the exception for debugging
            e.printStackTrace();
            return "Failed to save product: " + e.getMessage();
        }

    }


}
