package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.dao.CarDao;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String printWelcome(Integer count, ModelMap model) {
        List<String> messages = new ArrayList<>();
        new CarServiceImpl().listCarsFirst(count).forEach(car -> messages.add(car.toString()));
        model.addAttribute("messages", messages);
        return "cars";
    }
//    private final CarDao carDao;
//
//    public CarController(CarDao carDao) {
//        this.carDao = carDao;
//    }
//
//    @GetMapping//("/cars")
//    public String model (ModelMap model) {
//        model.addAttribute("cars", carDao.model());
//        return "cars/model";
//    }
//    @GetMapping("/{id}")
//    public String show(@PathVariable("id") int maxSpeed, Model model) {
//        model.addAttribute("cars", carDao.show(maxSpeed));
//        return null;
//    }
}
