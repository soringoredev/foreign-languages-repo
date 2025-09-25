package foerign.languages.foreign_languages_repo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Asta trebuia sa faca Cristiana
@RequestMapping("/v1")
public class FrancaisController {
    @GetMapping("/fr")
    public String francaisBonjour() {
        return "La France est le pays de l'amour.";
    }
}