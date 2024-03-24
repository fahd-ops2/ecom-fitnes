package io.fitness.ecom.dao;

import io.fitness.ecom.modals.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT p FROM Product p inner join Category c on c.id = p.category.id WHERE c.name = ?1")
    Page<Product> findByCategory(Pageable pageable, String category);
}
