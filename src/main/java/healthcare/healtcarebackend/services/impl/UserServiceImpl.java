package healthcare.healtcarebackend.services.impl;

import healthcare.healtcarebackend.constants.Constants;
import healthcare.healtcarebackend.models.*;
import healthcare.healtcarebackend.repositories.*;
import healthcare.healtcarebackend.services.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Data
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final CartRepository cartRepository;
    private final PaymentRepository paymentRepository;
    private final AddressRepository addressRepository;
    private final OrderRepository orderRepository;
//    private final PasswordEncoder passwordEncoder;
//
//    @Override
//    public void addRoleToUser(String email, String roleName) {
//        log.info("Add role {} to user {}", roleName, email);
//        User user = userRepository.findByEmail(email);
//        Role role = roleRepository.findByName(roleName);
//        user.getRoles().add(role);
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        User user = userRepository.findByEmail(email);
//        if(user == null) {
//            log.error("User not found in the database");
//            throw new UsernameNotFoundException("User not found in the database");
//        } else {
//            log.info("User found in the database, email: {}", email);
//        }
//
//        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        user.getRoles().forEach(role -> {
//            authorities.add(new SimpleGrantedAuthority(role.getName()));
//        });
//        return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(), authorities);
//    }

    @Override
    public void addRoleToUser(String email, String roleName) {

    }

    @Override
    public List<Cart> getUserCart(Long id) {
        return cartRepository.findCartByUserId(id);
    }

    @Override
    public List<Payment> getUserPayments(Long id) {
        return paymentRepository.findPaymentByUserId(id);
    }

    @Override
    public List<Address> getUserAddresses(Long id) {
        return addressRepository.findAddressByUserId(id);
    }

    @Override
    public Page<Order> getUserOrders(Long id, Pageable pageable) {
        String status = Constants.STATUS;

        return orderRepository.findOrderByUserIdAndStatus(id, status, pageable);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public User saveUser(User user) {
        //user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}
