package ru.sbt.lessons.servlet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {

    @RequestMapping("/accounts/get/{id}")
    public ModelAndView getAccount(@PathVariable("id") Long id) {
        ModelAndView account = new ModelAndView("account");
        account.addObject("accountId", id);
        return account;
    }

    @RequestMapping(value = "accounts/save", method = RequestMethod.POST)
    public String save(@RequestParam("accountId") Long accountId) {
        return "redirect:/accounts/get/" + accountId;
    }

}
