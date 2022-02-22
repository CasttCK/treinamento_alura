package br.com.alura.api.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.api.forum.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nome);

}
