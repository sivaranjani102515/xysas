package com.example.demo.Model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class OrderDetails{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer orderDetailsId;





}
