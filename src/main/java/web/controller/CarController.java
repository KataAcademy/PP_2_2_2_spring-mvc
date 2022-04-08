package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    public String getCountCar(@RequestParam(value = "count", required = false) Integer i,
                              Model model) {
        if (i == null) {
            i = 0;
        }
        model.addAttribute("cars", carServices.listCars(i));
        return "/cars";
    }

}
