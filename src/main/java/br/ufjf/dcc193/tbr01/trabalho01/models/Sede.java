package br.ufjf.dcc193.tbr01.trabalho01.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long sedeId;

    private String nomeFantasia;
    private String estado;
    private String cidade;
    private String bairro;
    private String telefone;
    private String site;

    public Sede() {
    }

    public Sede(String nomeFantasia, String estado, String cidade, String bairro, String telefone, String site) {
        this.nomeFantasia = nomeFantasia;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.telefone = telefone;
        this.site = site;
    }

    public Long getSedeId() {
        return sedeId;
    }

    public void setSedeId(Long id) {
        this.sedeId = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
