package foerign.languages.foreign_languages_repo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RoController {
    @GetMapping("/ro")
    public String mesajRomana() {
        return "Noi am facut o drumetie prin muntii Bucegi. ";
    }
}
