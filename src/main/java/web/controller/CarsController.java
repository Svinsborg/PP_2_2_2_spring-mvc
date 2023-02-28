package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.Service.CarServiceImp;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarServiceImp carService;

    @Autowired
    public CarsController(CarServiceImp carService) {
        this.carService = carService;
    }

    @GetMapping
    public String index(Model model){
        model.addAttribute("cars", carService.index());
        return "cars/index";
    }

    @GetMapping("/{count}")
    public String select(@PathVariable("count") int count, Model model){
        if(count >= 0) {
            model.addAttribute("cars", carService.countCars(count));
            return "cars/index";
        } else {
            return "cars/err/warning";
        }
    }
}
