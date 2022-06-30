package healthcare.healtcarebackend.controllers;

import healthcare.healtcarebackend.models.Payment;
import healthcare.healtcarebackend.services.PaymentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/payments")
public class PaymentController {
    private final PaymentService paymentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Payment createPayment(@RequestBody Payment payment) {
        log.info("Payment object: {}", payment);
        return paymentService.createPayment(payment);
    }
}
