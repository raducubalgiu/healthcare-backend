package healthcare.healtcarebackend.controllers;

import healthcare.healtcarebackend.models.*;
import healthcare.healtcarebackend.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
//
//    @PostMapping
//    public Role saveRole(@RequestBody Role role) {
//        return userService.saveRole(role);
//    }

    @PutMapping
    void addRoleToUser(String email, String roleName) {
        userService.addRoleToUser(email, roleName);
    }

    @GetMapping("/{id}/cart")
    @ResponseStatus(HttpStatus.OK)
    List<Cart> getUserCart(@PathVariable Long id) {
        return userService.getUserCart(id);
    }

    @GetMapping("/{id}/payments")
    @ResponseStatus(HttpStatus.OK)
    List<Payment> getUserPayments(@PathVariable Long id) {
        return userService.getUserPayments(id);
    }

    @GetMapping("/{id}/addresses")
    @ResponseStatus(HttpStatus.OK)
    List<Address> getUserAddresses(@PathVariable Long id) {
        log.info("User id: {}", id);
        return userService.getUserAddresses(id);
    }

    @GetMapping("/{id}/orders")
    @ResponseStatus(HttpStatus.OK)
    Page<Order> getUserOrders(@PathVariable Long id, Pageable pageable) {
        log.info("User id: {}", id);
        return userService.getUserOrders(id, pageable);
    }
}
