package hello.services;

import hello.entities.Address;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    private final Address address;

    public AddressService(Address address) {
        this.address = address;
    }

    public void show() {
        System.out.println("Address: " + address);
    }
}
