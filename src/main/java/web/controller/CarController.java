package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarServiceImpl carService;

    @GetMapping("/cars")
    public String getCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<Car> carList = carService.getCars(count);
        model.addAttribute("cars", carList);
        return "cars";

    }
}
