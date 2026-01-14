package com.media.productservice;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    // 1. المطلب (1.c): عملية عرض المنتجات (Read Operation)
    @GetMapping
    public List<Product> getAllProducts() {
        return List.of(
                new Product("1", "Laptop Dell", 1500.0),
                new Product("2", "iPhone 15", 3500.0)
        );
    }

    // 2. المطلب (1.d): التواصل مع خدمة المخزون (Inter-service Communication)
    @GetMapping("/check-stock/{id}")
    public String checkProductStock(@PathVariable String id) {
        RestTemplate restTemplate = new RestTemplate();
        try {
            // نطلب البيانات من خدمة المخزون (بورت 8082)
            String url = "http://localhost:8082/inventory/" + id;
            Boolean inStock = restTemplate.getForObject(url, Boolean.class);

            return (inStock != null && inStock) ? "المنتج متوفر في المخزون" : "عذراً، المنتج نفد من المخزون";
        } catch (Exception e) {
            return "خطأ: لم نتمكن من الاتصال بخدمة المخزون حالياً";
        }
    }
}