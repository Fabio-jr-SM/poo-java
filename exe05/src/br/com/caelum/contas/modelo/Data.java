package br.com.caelum.contas.modelo;
public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Método que devolve a data formatada
    public String formatada() {
        return String.format("%02d/%02d/%04d", dia, mes, ano); // Formata com dois dígitos para dia/mês e quatro para ano
    }
}
