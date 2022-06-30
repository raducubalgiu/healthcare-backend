package healthcare.healtcarebackend.services;

import healthcare.healtcarebackend.models.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface OrderService {
    Page<Order> getAllOrders(Pageable pageable);
    Order createOrder(Order order);
    Order updateOrder(Order order);
    Optional<Order> getOrder(Long id);
}
