package io.fitness.ecom.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "reference")
    private String reference;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private double price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
