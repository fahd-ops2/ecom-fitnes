package io.fitness.ecom.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "products_histories")
@Getter
@Setter
@Builder
public class ProductsHistories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;
    @Column(name = "action")
    private String action;
    @Column(name = "action_timestamp")
    private Date actionTimestamp;
}
