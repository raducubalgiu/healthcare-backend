package healthcare.healtcarebackend.controllers;

import healthcare.healtcarebackend.models.Address;
import healthcare.healtcarebackend.services.AddressService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@Data
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/addresses")
public class AddressController {
    private final AddressService addressService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Address createAddress(@RequestBody Address address) {
        log.info("Add address: {}", address);
        return addressService.createAddress(address);
    }
}
