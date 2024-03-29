package br.com.projeto.api.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.models.Cliente;
import br.com.projeto.api.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping("/cadastrar")
    public Cliente cadastrar(@RequestBody Cliente c){
        return repository.save(c);
    }
    
    @GetMapping("/cliente")
    public Iterable<Cliente> buscar(){
        return repository.findAll();
    }

    @PutMapping("/editar")
    public Cliente editar(@RequestBody Cliente c){
        return repository.save(c);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id){
        repository.deleteById(id);
    }
}
