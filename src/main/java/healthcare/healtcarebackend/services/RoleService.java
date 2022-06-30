package healthcare.healtcarebackend.services;

import healthcare.healtcarebackend.models.Role;

import java.util.List;

public interface RoleService {
    List<Role> getRoles();
    Role createRole(Role role);
    void deleteRole(Long id);
    Role updateRole(Role role);
}
