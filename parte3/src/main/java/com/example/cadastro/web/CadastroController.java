package com.example.cadastro.web;

import com.example.cadastro.domain.Pessoa;
import com.example.cadastro.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoas")
public class CadastroController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<Pessoa> getAll() {
        return pessoaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> getPessoa(@PathVariable Integer id) {

        Optional<Pessoa> optionalPessoa = pessoaRepository.findById(id);

        return optionalPessoa.isPresent() ? ResponseEntity.of(optionalPessoa) : ResponseEntity.notFound().build();
    }

}
