package ru.sbt.lessons.servlet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SBTJavastudent on 12.11.2016.
 */
@RestController
public class AccountRestController {

    @GetMapping("/api/accounts/get/{id}")
    public Account getById(@PathVariable("id") Long id){
        return new Account(id,"2353245",2342425L);
    }
}
