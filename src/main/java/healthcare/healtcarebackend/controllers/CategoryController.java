package healthcare.healtcarebackend.controllers;

import healthcare.healtcarebackend.models.Category;
import healthcare.healtcarebackend.models.Product;
import healthcare.healtcarebackend.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/categories")
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Category> getAllCategories() {
        return categoryService.getCategories();
    }

    @GetMapping("/{id}/products")
    @ResponseStatus(HttpStatus.OK)
    public Page<Product> getProductsByCategory(@PathVariable Long id, Pageable pageable) {
        return categoryService.getProductByCat(id, pageable);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Category saveCategory(@RequestBody Category category){
        return categoryService.createCategory(category);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Category updateCategory(@RequestBody Category category){
        return categoryService.updateCategory(category);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable final Long id){
        categoryService.deleteCategory(id);
    }

    @GetMapping("/hello-world")
    @ResponseStatus(HttpStatus.OK)
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/dashboard")
    @ResponseStatus(HttpStatus.OK)
    public String getDashboard() {
        return "Dashboard!";
    }
}
