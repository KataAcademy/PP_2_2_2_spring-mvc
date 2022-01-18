package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;


@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(defaultValue = "5") Integer count, Model model) {
        CarServiceImpl carServiceImpl = new CarServiceImpl();
        List<Car> listCars = carServiceImpl.getCars(count);
        model.addAttribute("cars", listCars);
        return "cars";
    }

}

