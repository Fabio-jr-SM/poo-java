package com.amazon.alpha.dispositivos;

public class Dispositivo {
    private String codigoIdentificacao;
    private String marca;
    private String modelo;
    private int anoFabricacao;

    public Dispositivo(String codigoIdentificacao, String marca, String modelo, int anoFabricacao) {
        this.codigoIdentificacao = codigoIdentificacao;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    // Getters e Setters
    public String getCodigoIdentificacao() {
        return codigoIdentificacao;
    }

    public void setCodigoIdentificacao(String codigoIdentificacao) {
        this.codigoIdentificacao = codigoIdentificacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "Código: " + codigoIdentificacao + ", Marca: " + marca + ", Modelo: " + modelo + ", Ano de Fabricação: " + anoFabricacao;
    }
}