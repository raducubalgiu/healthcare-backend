package healthcare.healtcarebackend.repositories;

import healthcare.healtcarebackend.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Category, Long> {
}
