package io.fitness.ecom.repository;

import io.fitness.ecom.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT p FROM Product p inner join Category c on c.id = p.category.id WHERE c.name = ?1")
    Page<Product> findByCategory(Pageable pageable, String category);
}
