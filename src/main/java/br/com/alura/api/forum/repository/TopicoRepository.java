package br.com.alura.api.forum.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.api.forum.entity.Topico;

public interface TopicoRepository extends JpaRepository <Topico, Long> {

	Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);
	
}
