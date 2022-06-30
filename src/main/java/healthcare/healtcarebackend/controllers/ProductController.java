package healthcare.healtcarebackend.controllers;

import healthcare.healtcarebackend.models.Product;
import healthcare.healtcarebackend.services.impl.ProductServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/products")
public class ProductController {
    private final ProductServiceImpl productService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<Product> getAllProducts(Pageable pageable) {
        return productService.getProducts(pageable);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Product> getProduct(@PathVariable  Long id) {
        return productService.getProduct(id);
    }

    @GetMapping("/get-latest")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getLatestProducts() {
        return productService.getLatest();
    }

    @GetMapping("/get-top")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getTopProducts() {
        return productService.getTopProducts();
    }

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product saveProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable Long id) {
       productService.deleteProduct(id);
    }
}
