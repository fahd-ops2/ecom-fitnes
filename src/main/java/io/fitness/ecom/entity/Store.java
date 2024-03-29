package io.fitness.ecom.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stores")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String address;
    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;

    @JsonIgnore
    @OneToMany(mappedBy = "store")
    private List<Stock> stocks;
}
