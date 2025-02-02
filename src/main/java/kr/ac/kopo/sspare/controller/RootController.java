package kr.ac.kopo.sspare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

    @GetMapping("/")
    String index(){
        return "index";
    }
}
