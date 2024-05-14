package ru.avrm.tm_warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model) {
        //SessionService.modelAddUser(model, session);
        //return "user/login";
        return "index";
    }
}
