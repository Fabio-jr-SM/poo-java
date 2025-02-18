package com.amazon.alpha.dispositivos;

public class Smartphone extends Dispositivo {
    private String sistemaOperacional;

    public Smartphone(String codigoIdentificacao, String marca, String modelo, int anoFabricacao, String sistemaOperacional) {
        super(codigoIdentificacao, marca, modelo, anoFabricacao);
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sistema Operacional: " + sistemaOperacional;
    }
}