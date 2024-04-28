package io.fitness.ecom.repository;

import io.fitness.ecom.entity.ProductsHistories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsHistoriesRepository extends JpaRepository<ProductsHistories, Long> {
}
