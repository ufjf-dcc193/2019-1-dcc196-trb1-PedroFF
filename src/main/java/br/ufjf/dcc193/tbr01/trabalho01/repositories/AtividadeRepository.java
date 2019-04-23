package br.ufjf.dcc193.tbr01.trabalho01.repositories;

import br.ufjf.dcc193.tbr01.trabalho01.models.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AtividadeRepository extends JpaRepository<Atividade,Long> {

    List<Atividade> findAllBySede(Long sede);
    @Query(value = "select sum(a.totalHorasAssistencial) from Atividade a where a.sede.id = ?1")
    Integer sumTotalHorasAssistencialAtividades(long sedeId);

    @Query(value = "select sum(a.totalHorasJuridica) from Atividade a where a.sede.id = ?1")
    Integer sumTotalHorasJuridicaAtividades(long sedeId);

    @Query(value = "select sum(a.totalHorasFinanceira) from Atividade a where a.sede.id = ?1")
    Integer sumTotalHorasFinanceiraAtividades(long sedeId);

    @Query(value = "select sum(a.totalHorasExecutiva) from Atividade a where a.sede.id = ?1")
    Integer sumTotalHorasExecutivaAtividades(long sedeId);
}
