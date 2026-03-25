package dev.infotex.NinjaCadastro;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PersonalController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Ninja Cadastro!";
    }
}
