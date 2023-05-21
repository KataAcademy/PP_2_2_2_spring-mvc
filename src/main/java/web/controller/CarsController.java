package web.controller;

import Model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller

public class CarsController {

    @GetMapping("/cars")
    public  String getCars(ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Model1","Color1", 1));
        cars.add(new Car("Model2","Color2", 2));
        cars.add(new Car("Model3","Color3", 3));
        cars.add(new Car("Model4","Color4", 4));
        cars.add(new Car("Model5","Color5", 5));
        model.addAttribute("cars", cars.toString());
        return "car";
    }
}
