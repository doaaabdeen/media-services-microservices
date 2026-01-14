package com.media.productservice;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    // 1. Requirement (1.c): Product Display Operation (Read Operation)
    @GetMapping
    public List<Product> getAllProducts() {
        return List.of(
                new Product("1", "Laptop Dell", 1500.0),
                new Product("2", "iPhone 15", 3500.0)
        );
    }

    // 2. Requirement (1.d): Communication with the Inventory Service (Inter-service Communication)
    @GetMapping("/check-stock/{id}")
    public String checkProductStock(@PathVariable String id) {
        RestTemplate restTemplate = new RestTemplate();
        try {
// We request data from the inventory service (port 8082)
            String url = "http://localhost:8082/inventory/" + id;
            Boolean inStock = restTemplate.getForObject(url, Boolean.class);

            return (inStock != null && inStock) ? "The product is in stock": "Sorry, the product is out of stock";
        } catch (Exception e) {
            return  "Error: We are currently unable to connect to the inventory service.";
        }
    }

}
