package com.media.inventoryservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @GetMapping("/{productId}")
    public boolean isInStock(@PathVariable String productId) {
        //  We will assume that product number 1 is available and product number 2 is not available
        return productId.equals("1");
    }

}
