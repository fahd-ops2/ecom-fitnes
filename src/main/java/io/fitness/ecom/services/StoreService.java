package io.fitness.ecom.services;

import io.fitness.ecom.dao.StoreRepository;
import io.fitness.ecom.services.dto.StoreDto;
import io.fitness.ecom.services.mappers.StoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    private final StoreRepository storeRepository;

    @Autowired
    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public Page<StoreDto> getAllStores(Pageable pageable) {
        Page page = storeRepository.findAll(pageable);
        List<StoreDto> stores = StoreMapper.INSTANCE.storesToStoreDtos(page.getContent());
        return new PageImpl<>(stores, page.getPageable(), page.getTotalElements());
    }
}
