package io.fitness.ecom.services.dto;

import io.fitness.ecom.modals.Provider;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StoreDto {
    private Long id;
    private String name;
    private String address;
    private Provider provider;

}
