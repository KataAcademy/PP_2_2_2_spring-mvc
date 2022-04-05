package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.services.CarServices;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarServices carServices;

    @Autowired
    public CarController(CarServices carServices) {
        this.carServices = carServices;
    }

    @GetMapping()
    public String allCars(Model model) {
        carServices.createListOfCars(1);
        model.addAttribute("cars", carServices.listCars(0));
        return "cars";
    }

    @PostMapping()
    public String createDefaultCars() {
        carServices.createListOfCars(7);
        return "redirect:/cars";
    }

    @GetMapping("/head1")
    public String getCountCar() {
        return "cars";
    }

}
