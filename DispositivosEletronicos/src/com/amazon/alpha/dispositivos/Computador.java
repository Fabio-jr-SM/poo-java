package com.amazon.alpha.dispositivos;

public class Computador extends Dispositivo {
    private int capacidadeRAM;

    public Computador(String codigoIdentificacao, String marca, String modelo, int anoFabricacao, int capacidadeRAM) {
        super(codigoIdentificacao, marca, modelo, anoFabricacao);
        this.capacidadeRAM = capacidadeRAM;
    }

    public int getCapacidadeRAM() {
        return capacidadeRAM;
    }

    public void setCapacidadeRAM(int capacidadeRAM) {
        this.capacidadeRAM = capacidadeRAM;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidade de RAM: " + capacidadeRAM + "GB";
    }
}