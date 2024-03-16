package io.fitness.ecom.modals;

import jakarta.persistence.*;

@Entity
@Table(name = "Product_Store")
public class ProductStore {

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Id
    @ManyToOne
    @JoinColumn(name = "store_id", nullable = false)
    private Store store;

}

