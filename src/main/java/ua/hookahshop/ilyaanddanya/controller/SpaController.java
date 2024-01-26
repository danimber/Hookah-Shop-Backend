package ua.hookahshop.ilyaanddanya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SpaController {

    @GetMapping("/{path:[^\\.]*}")
    public String forward(@PathVariable String path) {
        return "forward:/index.html";
    }
}
