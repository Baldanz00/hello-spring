package it.progettospring.hello_spring.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.progettospring.hello_spring.model.Utente;

@Controller
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime ora = LocalDateTime.now();

        String dataFormattata = ora.format(formatter);

        model.addAttribute("data", dataFormattata);
        model.addAttribute("titolo", "Benvenuti");
        return "index";
    }

    @GetMapping("/welcome")
    @ResponseBody
    public String welcome() {
        String name = "Bruno";
        return "<html><body><h1>Welcome " + name + "</h1></body></html>";
    }

    @GetMapping("/greeting-redirect")
    public String greetingRedirect() {
        return "redirect:/greeting";
    }

    @GetMapping("/utenti/")
    public String utenti(Model model) {

        model.addAttribute("utenti", creaListaUtenti());
        return "utenti";
    }

    @GetMapping("/utenti/{id}")
    public String utentiById(@PathVariable(name = "id", required = false) String param, Model model) {

        List<Utente> utenti = creaListaUtenti();
        Utente utenteFiltrato = null;
        for (Utente u : utenti) {
            if (u.getPersonalCode().equals(param)) {
                utenteFiltrato = u;
                break;
            }
        }

        if (utenteFiltrato != null) {
            System.out.println(utenteFiltrato);
            model.addAttribute("user", utenteFiltrato);
        }
        return "details";
    }

    public List<Utente> creaListaUtenti() {
        List<Utente> listaUtente = new ArrayList<>();

        listaUtente.add(new Utente("Bruno", "Bruni", 20, "bruno.2@gmail.com", "12345678"));
        listaUtente.add(new Utente("Mario", "Rossi", 25, "mariorossi@gmail.com", "54732"));
        listaUtente.add(new Utente("Pinco", "Pallino", 30, "pallino@gmail.com", "00345"));
        listaUtente.add(new Utente("Giulio", "Bianchi", 31, "g.bianchi@gmail.com", "10346"));
        listaUtente.add(new Utente("Giuseppe", "Pallino", 33, "g.pallino@gmail.com", "11345"));
        listaUtente.add(new Utente("Gioia", "Travaglini", 24, "gtravaglini@gmail.com", "1234"));
        listaUtente.add(new Utente("Renato", "Pirri", 33, "renato.pirri@gmail.com", "5678"));
        listaUtente.add(new Utente("Stefano", "Aggius-Vella", 21, "stefano.aggius.vella@gmail.com", "9876"));
        listaUtente.add(new Utente("Giuseppe", "Manna", 26, "g.manna@gmail.com", "4645"));
        listaUtente.add(new Utente("Anna", "Buchynska", 18, "a.buchynska@gmail.com", "10483"));
        listaUtente.add(new Utente("John", "Giangrossi", 31, "j.giangrossi@gmail.com", "132400345"));
        listaUtente.add(new Utente("Antonio", "Le Rose", 31, "a.lerose@gmail.com", "00345888"));
        listaUtente.add(new Utente("Denis", "Dyvohryts", 21, "d.Dyvohryts@gmail.com", "03454350345"));
        listaUtente.add(new Utente("Michelangela", "Paesano", 29, "m.paesano@gmail.com", "03454356787612"));

        return listaUtente;
    }
}
