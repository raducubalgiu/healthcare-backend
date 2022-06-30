package healthcare.healtcarebackend.repositories;

import healthcare.healtcarebackend.models.Cart;
import healthcare.healtcarebackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findCartById(Long id);
    List<Cart> findCartByUserId(Long id);
}
