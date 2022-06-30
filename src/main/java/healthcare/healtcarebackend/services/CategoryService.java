package healthcare.healtcarebackend.services;

import healthcare.healtcarebackend.models.Category;
import healthcare.healtcarebackend.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoryService {
    List<Category> getCategories();
    Category createCategory(Category category);
    void deleteCategory(final Long id);
    Category updateCategory(Category category);
    Page<Product> getProductByCat(Long id, Pageable pageable);
}
