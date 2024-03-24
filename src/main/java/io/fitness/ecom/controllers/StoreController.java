package io.fitness.ecom.controllers;

import io.fitness.ecom.services.StoreService;
import io.fitness.ecom.services.dto.StoreDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stores")
public class StoreController {
    private final StoreService storeService;

    @Autowired
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/all")
    public Page<StoreDto> getAllStores(@RequestParam("page") int page,
                                       @RequestParam("size") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return storeService.getAllStores(pageable);
    }
}
