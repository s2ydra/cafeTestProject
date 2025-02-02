package kr.ac.kopo.sspare.controller;

import kr.ac.kopo.sspare.model.Drink;
import kr.ac.kopo.sspare.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/drink")
public class DrinkController {

    private final DrinkService service;

    private static final String path = "drink/";

    public DrinkController(DrinkService service) {
        this.service = service;
    }

    @GetMapping("/list")
    String list(Model model) {
        List<Drink> list = service.list();
        model.addAttribute("list", list);
        return path + "list";
    }

    @GetMapping("/add")
    String add() {
        return path + "add";
    }

    @PostMapping("/add")
    String add(Drink item) {
        System.out.println(item);
        service.add(item);
        return "redirect:list";
    }
}
