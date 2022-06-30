package healthcare.healtcarebackend.services;

import healthcare.healtcarebackend.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Page<Product> getProducts(Pageable pageable);
    Product createProduct(Product product);
    void deleteProduct(Long id);
    List<Product> getLatest();
    List<Product> getTopProducts();
    Product updateProduct(Product product);
    Optional<Product> getProduct(Long id);
}
