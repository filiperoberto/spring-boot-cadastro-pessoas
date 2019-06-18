package com.example.cadastro.web;

import com.example.cadastro.domain.Pessoa;
import com.example.cadastro.dto.NomeDTO;
import com.example.cadastro.repository.PessoaRepository;
import com.example.cadastro.services.PessoaService;
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

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/{id}")
    public Pessoa editaPessoa(@PathVariable Integer id, @RequestBody NomeDTO nomeDTO) {
        return pessoaService.editarPessoa(id, nomeDTO);
    }

    @GetMapping
    public List<Pessoa> getAll() {
        return pessoaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> getPessoa(@PathVariable Integer id) {

        Optional<Pessoa> optionalPessoa = pessoaRepository.findById(id);

        return optionalPessoa.isPresent() ? ResponseEntity.of(optionalPessoa) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Pessoa adicionarPessoa(@RequestBody Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }



}
