package com.media.inventoryservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @GetMapping("/{productId}")
    public boolean isInStock(@PathVariable String productId) {
        // سنفترض أن المنتج رقم 1 متوفر والمنتج رقم 2 غير متوفر
        return productId.equals("1");
    }
}