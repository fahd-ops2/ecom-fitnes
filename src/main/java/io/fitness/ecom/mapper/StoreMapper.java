package io.fitness.ecom.mapper;

import io.fitness.ecom.entity.Store;
import io.fitness.ecom.dto.StoreDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StoreMapper {
    StoreMapper INSTANCE = Mappers.getMapper(StoreMapper.class);

    public StoreDto storeToStoreDto(Store store);

    public Store storeDtoToStore(StoreDto storeDto);

    public List<StoreDto> storesToStoreDtos(List<Store> stores);

    public List<Store> storeDtosToStores(List<StoreDto> storeDtos);

}
