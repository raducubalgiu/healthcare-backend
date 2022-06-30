package healthcare.healtcarebackend.controllers;

import healthcare.healtcarebackend.models.Cart;
import healthcare.healtcarebackend.services.CartService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/carts")
@Slf4j
public class CartController {
    private final CartService cartService;

    @PostMapping
    public Cart createCart(@RequestBody  Cart cart) {
        return cartService.createCart(cart);
    }

    @DeleteMapping("/{id}")
    public void deleteCart(@PathVariable Long id) {
        cartService.deleteCart(id);
    }

    @PutMapping("/{id}")
    public Cart changeQuantity(@RequestBody Cart cart) {
        log.info("The cart body: {}", cart);
        return cartService.updateCart(cart);
    }
}
