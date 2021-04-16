package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.CarServiceImpl;
import java.util.Optional;

@Controller
public class CarsController {
    @Autowired
    private CarServiceImpl carService;

    @GetMapping(value = "/cars")
    public String index (@RequestParam(value = "count", required = false) Optional <Integer> count, Model model) {
        model.addAttribute("cars", carService.carsCount(count.orElse(0)));
        return "cars";
    }
}