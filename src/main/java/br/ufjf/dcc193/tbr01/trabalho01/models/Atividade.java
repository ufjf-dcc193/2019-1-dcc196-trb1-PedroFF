package br.ufjf.dcc193.tbr01.trabalho01.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String titulo;
    private String descricao;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataIni;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataFim;
    private int totalHorasAssistencial;
    private int totalHorasJuridica;
    private int totalHorasExecutiva;
    private int totalHorasFinanceira;
    private int totalHoras;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sedeId", nullable = false)
    private Sede sede;

    public Atividade(String titulo, String descricao, LocalDate dataIni, LocalDate dataFim, int totalHorasAssistencial, int totalHorasJuridica, int totalHorasExecutiva, int totalHorasFinanceira, Sede sede) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataIni = dataIni;
        this.dataFim = dataFim;
        this.totalHorasAssistencial = totalHorasAssistencial;
        this.totalHorasJuridica = totalHorasJuridica;
        this.totalHorasExecutiva = totalHorasExecutiva;
        this.totalHorasFinanceira = totalHorasFinanceira;
        this.sede = sede;
    }

    public Atividade(){}

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataIni() {
        return dataIni;
    }

    public void setDataIni(LocalDate dataIni) {
        this.dataIni = dataIni;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
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