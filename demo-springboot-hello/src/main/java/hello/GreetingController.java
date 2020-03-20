package hello;

import hello.services.AddressService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    private final AddressService addressService;

    public GreetingController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);

        addressService.show();

        return "greeting";
    }

}
