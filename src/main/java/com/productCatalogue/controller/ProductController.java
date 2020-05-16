package com.productCatalogue.controller;


import com.productCatalogue.model.Product;
import com.productCatalogue.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductService productService;

    //Get all the products available
    @GetMapping(value = "/allProducts")
    public List<Product> getAllProducts(){
        return(productService.getAllProducts());
    }

    //Group the products by Color
    @GetMapping(value = "/sortProductsByColor")
    public Map<String, List<Product>> getProductsByColor(){
        return(productService.getProductsByColor());
    }

    //Group the products by Size
    @GetMapping(value = "/sortProductsBySize")
    public Map<String, List<Product>> getProductsBySize(){
        return(productService.getProductsBySize());
    }

    //Get available number of products per seller
    @GetMapping(value = "/quantityPerSeller")
    public Map<String, Integer> getQuantityPerSeller(){
        return(productService.getProductsPerSeller());
    }
}
