package br.com.senai.correcao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.correcao.entity.Curso;
import br.com.senai.correcao.repository.CursoRepository;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    //Find All
    public List<Curso> findAll(){
        return cursoRepository.findAll();
    }

    //Find By Id
    public Curso FindById(Long id){
        return cursoRepository.findById(id).orElse(null);
    }

    //Insert New
    public Curso insertNew(Curso curso){
        return cursoRepository.save(curso);
    }

    // Insert List
    public List<Curso> insertList(List<Curso> cursos) {
        return cursoRepository.saveAll(cursos);
    }

    //Update
    public Curso update(Long id, Curso cursoAlterado){
        Curso cursoAtual = FindById(id);
        cursoAtual.setNome(cursoAlterado.getNome());
        cursoAtual.setCategoria(cursoAlterado.getCategoria());
        cursoAtual.setCargaHoraria(cursoAlterado.getCargaHoraria());
        return cursoRepository.save(cursoAtual);
    }

    //Delete
    public Boolean delete(Long id){
        Curso curso = FindById(id);
        if (curso == null) {
            return false;
        }
        else{
            cursoRepository.delete(curso);
            return true;
        }
    }



}
