package healthcare.healtcarebackend.repositories;

import healthcare.healtcarebackend.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findProductById(Long id);

    @Query(value = "SELECT * FROM products WHERE active=true ORDER BY created_at DESC LIMIT 10", nativeQuery = true)
    List<Product> getLatestProducts();

    @Query(value = "SELECT * FROM products WHERE active=true ORDER BY rating DESC LIMIT 10", nativeQuery = true)
    List<Product> getTopProducts();

    Page<Product> findAllByCategoryId(long id, Pageable pageable);
}
