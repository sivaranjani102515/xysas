package com.example.demo.Repository;

import com.example.demo.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    // List<Product>findByProduct_name(String Product_name);

}
