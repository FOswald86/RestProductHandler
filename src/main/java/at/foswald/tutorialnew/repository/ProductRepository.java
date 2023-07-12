package at.foswald.tutorialnew.repository;

import at.foswald.tutorialnew.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
