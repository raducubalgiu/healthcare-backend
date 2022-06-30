package healthcare.healtcarebackend.repositories;

import healthcare.healtcarebackend.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
