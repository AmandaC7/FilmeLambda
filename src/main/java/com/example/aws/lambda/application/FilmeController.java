package com.example.aws.lambda.application;

import com.example.aws.lambda.domain.Filme;
import com.example.aws.lambda.persistence.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeRepository filmeRepository;

    @GetMapping()
    public List<Filme> listar() {
        return filmeRepository.findAll();
    }

    @PostMapping
    @ResponseStatus
    public ResponseEntity<Filme> criar(@Valid @RequestBody Filme filme) {
        filmeRepository.save(filme);
        return  ResponseEntity.status(HttpStatus.CREATED).body(filme);
    }
}
