package com.productCatalogue.services;


import com.productCatalogue.model.Product;
import com.productCatalogue.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    ProductRepository product;

    public List<Product> getAllProducts(){
        return product.getProductList();
    }

    public  Map<String, List<Product>> getProductsByColor(){
        Map<String, List<Product>> colorSortedMap = getAllProducts().stream()
                .collect(Collectors.groupingBy((p) -> p.getColor()));
        return colorSortedMap;
    }

    public  Map<String, List<Product>> getProductsBySize(){
        Map<String, List<Product>> sizeSortedMap = getAllProducts().stream()
                .collect(Collectors.groupingBy((p) -> p.getSize()));
        return sizeSortedMap;
    }

    public Map<String, Integer> getProductsPerSeller(){
        Map<String, List<Product>> quantityPerSeller = getAllProducts().stream()
                .collect(Collectors.groupingBy((p) -> p.getSeller()));

        Map<String, Integer> map = new HashMap<>();
        for(Map.Entry<String, List<Product>> entry : quantityPerSeller.entrySet()){
            int quantity = 0;
            List<Product> productList = entry.getValue();
            for (Product product: productList) {
                quantity += product.getQuantity();
            }
            map.put(entry.getKey(),quantity);
        }

        return map;
    }
}
