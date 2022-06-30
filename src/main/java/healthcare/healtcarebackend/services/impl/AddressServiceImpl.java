package healthcare.healtcarebackend.services.impl;

import healthcare.healtcarebackend.models.Address;
import healthcare.healtcarebackend.repositories.AddressRepository;
import healthcare.healtcarebackend.services.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;

    @Override
    public Address createAddress(Address address) { return addressRepository.save(address);
    }
}
