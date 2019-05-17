package com.example.cadastro.web;

import com.example.cadastro.domain.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")
public class CadastroController {

    @GetMapping(value = "/qualquer")
    public Pessoa getPessoaQualquer() {
        return new Pessoa(1,"Darth Vader");
    }

}
