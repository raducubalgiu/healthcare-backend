package healthcare.healtcarebackend.repositories;

import healthcare.healtcarebackend.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findAddressByUserId(Long id);
}
