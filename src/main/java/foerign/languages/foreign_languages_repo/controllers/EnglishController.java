package foerign.languages.foreign_languages_repo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnglishController {
    @GetMapping("/en")
    public String englishGreeting() {
        return "Java was released in 1995 by Sun Microsystems.";
    }
}
