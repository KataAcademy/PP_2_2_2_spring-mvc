package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

//@RequestMapping("/cars")
@Controller
public class CarsController {
    String count = null;
    CarServiceImpl carServiceImpl;
    @Autowired
    public CarsController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam (value = "count", required = false) String count, Model model) {
        if (count == null) {
            model.addAttribute("cars", carServiceImpl.getListOfCars(carServiceImpl.getCarCount()));
        } else if (Integer.parseInt(count) >= 5) {
            model.addAttribute("cars", carServiceImpl.getListOfCars(carServiceImpl.getCarCount()));
        } else {
            model.addAttribute("cars", carServiceImpl.getListOfCars(Integer.parseInt(count)));
        }


        return "carsView/cars";
    }
}
