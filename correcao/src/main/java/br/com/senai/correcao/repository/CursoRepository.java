package br.com.senai.correcao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.correcao.entity.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}
