package web.controller;

import DAO.CarDAOImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/cars")
public class CarsController {
    @GetMapping()
    public String getCars(@RequestParam(value = "count", required = false) Integer count , Model model) {
        if (count == null) {
            model.addAttribute("allCars", new CarDAOImpl().fullCarList());
            return "car";
        }
        model.addAttribute("count", new CarDAOImpl().carlist(count));
        return "car";
    }





}
