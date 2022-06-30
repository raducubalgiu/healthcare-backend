package healthcare.healtcarebackend.services;

import healthcare.healtcarebackend.models.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    void addRoleToUser(String email, String roleName);
    List<Cart> getUserCart(Long id);
    List<Payment> getUserPayments(Long id);
    List<Address> getUserAddresses(Long id);
    Page<Order> getUserOrders(Long id, Pageable pageable);
    List<User> getUsers();
    Role saveRole(Role role);
    User saveUser(User user);
}
