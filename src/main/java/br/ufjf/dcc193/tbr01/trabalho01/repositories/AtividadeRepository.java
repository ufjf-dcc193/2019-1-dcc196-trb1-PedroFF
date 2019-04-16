package br.ufjf.dcc193.tbr01.trabalho01.repositories;

import br.ufjf.dcc193.tbr01.trabalho01.models.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AtividadeRepository extends JpaRepository<Atividade,Long> {
    List<Atividade> findAllBySede(Long sede);
}
