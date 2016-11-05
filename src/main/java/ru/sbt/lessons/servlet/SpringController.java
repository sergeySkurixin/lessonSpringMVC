package ru.sbt.lessons.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {

    @RequestMapping("/accounts/{id}")
    public String getAccount(@PathVariable("id") Long id) {

        return "account";
    }
}
