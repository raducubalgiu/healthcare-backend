package healthcare.healtcarebackend.services;

import healthcare.healtcarebackend.models.Cart;

import java.math.BigDecimal;

public interface CartService {
    Cart createCart(Cart cart);
    void deleteCart(Long id);
    Cart updateCart(Cart cart);
}
