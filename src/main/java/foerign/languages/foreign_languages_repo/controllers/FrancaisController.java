package foerign.languages.foreign_languages_repo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrancaisController {
    @GetMapping("v1/fr")
    public String francaisBonjour() {
        return "La France est le pays de l'amour.";
    }
}