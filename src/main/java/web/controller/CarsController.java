package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
//@RequestMapping("/cars")
@Controller
public class CarsController {

    CarService carService;
    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(HttpServletRequest request, Model model) {
        String count = request.getParameter("count");
        if (count == null) {
            model.addAttribute("cars", carService.getListOfCars(carService.getCarCount()));
        } else if (Integer.parseInt(count) >= 5) {
            model.addAttribute("cars", carService.getListOfCars(carService.getCarCount()));
        } else {
            model.addAttribute("cars", carService.getListOfCars(Integer.parseInt(count)));
        }


        return "carsView/cars";
    }
}
