package br.ufjf.dcc193.tbr01.trabalho01.models;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class Membro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;
    private String funcao;
    private String email;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sedeId", nullable = false)
    private Sede sede;

    public Membro() {
    }

    public Membro(String nome, String funcao, String email, LocalDate dataEntrada, LocalDate dataSaida, Sede sede) {
        this.nome = nome;
        this.funcao = funcao;
        this.email = email;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.sede = sede;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }


}