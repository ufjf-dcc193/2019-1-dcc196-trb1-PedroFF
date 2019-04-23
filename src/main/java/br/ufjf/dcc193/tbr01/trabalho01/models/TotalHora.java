package br.ufjf.dcc193.tbr01.trabalho01.models;

public class TotalHora {
    private Sede sede;
    private Integer totalHorasAssistencial;
    private Integer totalHorasJuridica;
    private Integer totalHorasFinanceira;
    private Integer totalHorasExecutiva;

    public TotalHora(Sede sede, Integer totalHorasAssistencial, Integer totalHorasJuridica, Integer totalHorasFinanceira, Integer totalHorasExecutiva) {
        this.sede = sede;
        this.totalHorasAssistencial = totalHorasAssistencial;
        this.totalHorasJuridica = totalHorasJuridica;
        this.totalHorasFinanceira = totalHorasFinanceira;
        this.totalHorasExecutiva = totalHorasExecutiva;
    }

    public TotalHora() {
    }

    public Sede getSede() {
        return sede;
    }

    public TotalHora setSede(Sede sede) {
        this.sede = sede;
        return this;
    }

    public Integer getTotalHorasAssistencial() {
        return totalHorasAssistencial;
    }

    public TotalHora setTotalHorasAssistencial(Integer totalHorasAssistencial) {
        this.totalHorasAssistencial = totalHorasAssistencial;
        return this;
    }

    public Integer getTotalHorasJuridica() {
        return totalHorasJuridica;
    }

    public TotalHora setTotalHorasJuridica(Integer totalHorasJuridica) {
        this.totalHorasJuridica = totalHorasJuridica;
        return this;
    }

    public Integer getTotalHorasFinanceira() {
        return totalHorasFinanceira;
    }

    public TotalHora setTotalHorasFinanceira(Integer totalHorasFinanceira) {
        this.totalHorasFinanceira = totalHorasFinanceira;
        return this;
    }

    public Integer getTotalHorasExecutiva() {
        return totalHorasExecutiva;
    }

    public TotalHora setTotalHorasExecutiva(Integer totalHorasExecutiva) {
        this.totalHorasExecutiva = totalHorasExecutiva;
        return this;
    }
}
