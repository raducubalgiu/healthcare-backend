package healthcare.healtcarebackend.services.impl;

import healthcare.healtcarebackend.models.Cart;
import healthcare.healtcarebackend.repositories.CartRepository;
import healthcare.healtcarebackend.services.CartService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;

    @Override
    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public void deleteCart(Long id) {
        cartRepository.deleteById(id);
    }

    @Override
    public Cart updateCart(Cart cart) {
        return cartRepository.save(cart);
    }
}
