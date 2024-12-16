package br.com.senai.correcao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.correcao.entity.Curso;
import br.com.senai.correcao.service.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    //Find All
    @GetMapping
    public ResponseEntity<List<Curso>> findAll(){
        List<Curso> cursos = cursoService.findAll();
        return ResponseEntity.ok().body(cursos);
    }

    //Find By Id
    @GetMapping("/{id}")
    public ResponseEntity<Curso> findById(@PathVariable Long id){
        Curso curso = cursoService.FindById(id);
        return ResponseEntity.ok().body(curso);
    }

    //Insert New
    @PostMapping
    public ResponseEntity<Curso> insertNew(@RequestBody Curso cursoInserido){
        Curso curso = cursoService.insertNew(cursoInserido);
        return ResponseEntity.ok().body(curso);
    }

     // Insert list
    @PostMapping("/list")
    public ResponseEntity<List<Curso>> insertList(@RequestBody List<Curso> cursos) {
        List<Curso> cursosList = cursoService.insertList(cursos);
        return ResponseEntity.ok().body(cursosList);
    }

    //Update
    @PutMapping("/{id}")
    public ResponseEntity<Curso> update(@PathVariable Long id, @RequestBody Curso cursoAlterado){
        Curso cursoAtual = cursoService.update(id, cursoAlterado);
        return ResponseEntity.ok().body(cursoAtual);
    }

    //Delete
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        Boolean flag = cursoService.delete(id);
        return ResponseEntity.ok().body(flag);
    }

}
