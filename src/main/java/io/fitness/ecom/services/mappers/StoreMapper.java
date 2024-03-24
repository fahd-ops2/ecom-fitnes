package io.fitness.ecom.services.mappers;

import io.fitness.ecom.modals.Store;
import io.fitness.ecom.services.dto.StoreDto;
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
