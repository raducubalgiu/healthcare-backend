package healthcare.healtcarebackend.repositories;

import healthcare.healtcarebackend.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findPaymentByUserId(Long id);
}
