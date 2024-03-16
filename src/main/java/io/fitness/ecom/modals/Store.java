package io.fitness.ecom.modals;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Store {

    private Long id;
    private String name;
    private String address;
    private List<Product> products;
}
