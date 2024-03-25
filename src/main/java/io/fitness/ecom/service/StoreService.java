package io.fitness.ecom.service;

import io.fitness.ecom.dto.StoreDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StoreService {
    Page<StoreDto> getAllStores(Pageable pageable);
}
