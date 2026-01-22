package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.CarCreateRequest;
import web.service.CarService;

import javax.validation.Valid;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String cars(@RequestParam(value = "count", required = false) Integer count,
                       Model model) {
        model.addAttribute("cars", carService.list(count));
        model.addAttribute("carForm", new CarCreateRequest());
        return "cars";
    }

    @PostMapping
    public String addCar(
            @Valid @ModelAttribute("carForm") CarCreateRequest carForm,
            BindingResult bindingResult,
            @RequestParam(value = "count", required = false) Integer count,
            Model model
    ) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("cars", carService.list(count));
            return "cars";
        }

        carService.add(carForm);
        return "redirect:/cars";
    }

}
