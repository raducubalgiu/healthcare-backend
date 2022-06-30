package healthcare.healtcarebackend.services.impl;

import healthcare.healtcarebackend.models.Payment;
import healthcare.healtcarebackend.repositories.PaymentRepository;
import healthcare.healtcarebackend.services.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;

    @Override
    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }
}
