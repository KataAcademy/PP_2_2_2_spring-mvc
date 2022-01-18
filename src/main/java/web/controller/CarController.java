package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;


@Controller
public class CarController {
    private  CarServiceImpl carServiceImpl;

    @Autowired
    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(defaultValue = "5") Integer count, Model model) {

        List<Car> listCars = carServiceImpl.getCars(count);
        model.addAttribute("cars", listCars);
        return "cars";
    }

}

