package com.productCatalogue.repository;

import com.productCatalogue.model.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {

    public List<Product> getProductList(){
        Product productShirt1 = new Product(1, "Shirt","Levis","black","L",200, 2,"Ramlal");
        Product productPant1 = new Product(1, "Pant","Spykar","blue","L",500, 2,"Shyamlal");
        Product productShirt2 = new Product(1, "Shirt","Vimal","white","M",200, 4,"Motilal");
        Product productPant2 = new Product(1, "Pant","Raymond","pink","XL",1000, 3,"Shyamlal");
        List<Product> productList = Arrays.asList(productShirt1,productShirt2,productPant1,productPant2);

        return productList;
    }
}
