package com.example.demo.Service.Category;

import com.example.demo.Model.Category;

import java.util.List;

public interface CategoryService  {


    String addCategory(Category category);

    List<String> displayMainCategory();

    List<String> displaySubCategory(String mainCategory);
}
