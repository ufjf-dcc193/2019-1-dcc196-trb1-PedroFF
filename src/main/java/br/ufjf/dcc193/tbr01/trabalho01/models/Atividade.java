package br.ufjf.dcc193.tbr01.trabalho01.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String titulo;
    private String descricao;
    private Date dataIni;
    private Date dataFim;
    private int totalHorasAssistencial;
    private int totalHorasJuridica;
    private int totalHorasExecutiva;
    private int totalHorasFinanceira;
    private Sede sede;

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataIni() {
        return dataIni;
    }

    public void setDataIni(Date dataIni) {
        this.dataIni = dataIni;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public int getTotalHorasAssistencial() {
        return totalHorasAssistencial;
    }

    public void setTotalHorasAssistencial(int totalHorasAssistencial) {
        this.totalHorasAssistencial = totalHorasAssistencial;
    }

    public int getTotalHorasJuridica() {
        return totalHorasJuridica;
    }

    public void setTotalHorasJuridica(int totalHorasJuridica) {
        this.totalHorasJuridica = totalHorasJuridica;
    }

    public int getTotalHorasExecutiva() {
        return totalHorasExecutiva;
    }

    public void setTotalHorasExecutiva(int totalHorasExecutiva) {
        this.totalHorasExecutiva = totalHorasExecutiva;
    }

    public int getTotalHorasFinanceira() {
        return totalHorasFinanceira;
    }

    public void setTotalHorasFinanceira(int totalHorasFinanceira) {
        this.totalHorasFinanceira = totalHorasFinanceira;
    }
}