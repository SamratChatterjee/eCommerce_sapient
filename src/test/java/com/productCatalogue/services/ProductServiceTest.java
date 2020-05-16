package com.productCatalogue.services;

import com.productCatalogue.model.Product;
import com.productCatalogue.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    ProductRepository productRepository;

    @InjectMocks
    ProductService productService = new ProductService();

    @Test
    void getAllProducts() {
        List<Product> expected = new ArrayList<>();
        List<Product> actual = productService.getAllProducts();
        assertEquals(expected,actual);
    }

    /*
    @Nested -- for test suite
    create a class and then keep on writing the test case as per the controller methods
    like sort by color, sort by size will have various test cases whci we can group under one one nested classes.
     */
}