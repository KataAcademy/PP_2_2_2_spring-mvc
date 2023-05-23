package web.controller;

import DAO.CarDAO;
import DAO.CarDAOImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/cars")
public class CarsController {
    @GetMapping()
    public String getCars(ModelMap model) {
        model.addAttribute("cars", new CarDAOImpl().fullCarList());
        return "car";
    }





}
