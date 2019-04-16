package br.ufjf.dcc193.tbr01.trabalho01.repositories;

import br.ufjf.dcc193.tbr01.trabalho01.models.Membro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MembroRepository extends JpaRepository<Membro, Long> {
    List<Membro> findAllBySede(Long sede);
}
