package healthcare.healtcarebackend.services.impl;

import healthcare.healtcarebackend.models.Category;
import healthcare.healtcarebackend.models.Product;
import healthcare.healtcarebackend.repositories.CategoriesRepository;
import healthcare.healtcarebackend.repositories.ProductRepository;
import healthcare.healtcarebackend.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoriesRepository categoriesRepository;
    private final ProductRepository productRepository;

    @Override
    public List<Category> getCategories() {
        return categoriesRepository.findAll();
    }

    @Override
    public Category createCategory(Category category) {
        return categoriesRepository.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        categoriesRepository.deleteById(id);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoriesRepository.save(category);
    }

    @Override
    public Page<Product> getProductByCat(Long id, Pageable pageable) {
        return productRepository.findAllByCategoryId(id, pageable);
    }
}
