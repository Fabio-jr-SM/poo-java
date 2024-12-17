package br.com.caelum.contas.modelo;

public class Conta {
    private static int contadorDeIdentificadores = 0; // Atributo estático (compartilhado)
    private int identificador; // Atributo único para cada instância
    private double saldo;
    private String titular;
    private Data dataDeAbertura;

    // Construtor padrão (sem parâmetros)
    public Conta(Data dataDeAbertura) {
        Conta.contadorDeIdentificadores++;
        this.identificador = Conta.contadorDeIdentificadores;
        this.dataDeAbertura = dataDeAbertura;
        this.titular = "Titular não informado"; 
    }
    
    // Construtor com parâmetro para inicializar o titular
    public Conta(String titular,Data dataDeAbertura) {
        Conta.contadorDeIdentificadores++;
        this.identificador = Conta.contadorDeIdentificadores;
        this.dataDeAbertura = dataDeAbertura;
        this.titular = titular;
    }

    // Getter para saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter para saldo
    public void setSaldo(double saldo) {
        if (saldo >= 0) { // Validação
            this.saldo = saldo;
        } else {
            System.out.println("Saldo não pode ser negativo!");
        }
    }

    // Getter para titular
    public String getTitular() {
        return titular;
    }

    // Setter para titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Método que calcula rendimento
    public double calculaRendimento() {
        return this.saldo * 0.05; // 5% de rendimento
    }

    public int getIdentificador(){
        return identificador;
    }

    public String getDataAbertura(){
        return dataDeAbertura.formatada();
    }
}
