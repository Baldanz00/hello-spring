package it.progettospring.hello_spring.controller;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("saluta")
    public String saluta(@RequestParam(required = false) String nome) {
        return "Ciao, " + nome + " sono le " + LocalTime.now();
    }

}
