package io.fitness.ecom.service.impl;

import io.fitness.ecom.repository.StoreRepository;
import io.fitness.ecom.dto.StoreDto;
import io.fitness.ecom.mapper.StoreMapper;
import io.fitness.ecom.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    private final StoreRepository storeRepository;

    @Autowired
    public StoreServiceImpl(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public Page<StoreDto> getAllStores(Pageable pageable) {
        Page page = storeRepository.findAll(pageable);
        List<StoreDto> stores = StoreMapper.INSTANCE.storesToStoreDtos(page.getContent());
        return new PageImpl<>(stores, page.getPageable(), page.getTotalElements());
    }
}
