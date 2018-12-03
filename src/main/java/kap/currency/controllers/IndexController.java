package kap.currency.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/currency")
    public String getIndexPage(Model model){

        return "index";

    }
}
