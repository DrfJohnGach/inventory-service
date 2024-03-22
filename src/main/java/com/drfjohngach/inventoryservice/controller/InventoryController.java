package com.drfjohngach.inventoryservice.controller;

import com.drfjohngach.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/{skuCode}")
    @ResponseStatus(HttpStatus.OK)
    public Boolean isInStock(@PathVariable("SkuCode") String skuCode){
        return inventoryService.isInStock(skuCode);
    }
}
