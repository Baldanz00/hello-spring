package it.progettospring.hello_spring.controller;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.progettospring.hello_spring.model.Studente;

@Controller
@RequestMapping("/")
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(required = false) String nome,
            Model model) {

        Studente s = new Studente();
        s.setId(123123123);
        s.setName("Gioia");
        s.setLastName("Travaglini");

        List<Studente> students = new ArrayList<>();
        students.add(s);

        model.addAttribute("name", nome);
        model.addAttribute("username", "user_" + nome);
        model.addAttribute("time", LocalTime.now());
        model.addAttribute("student", s);
        model.addAttribute("students", students);

        model.addAttribute("price", 12.23);

        List<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2.1);
        list.add(3.2);

        model.addAttribute("list", list);

        return "greeting";
    }

}
