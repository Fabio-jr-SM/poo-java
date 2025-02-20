package com.ifmt.model;

public class FuncionarioComissionado extends Funcionario {
    private double vendas;
    private double percentualComissao;

    public FuncionarioComissionado(String nome, double salarioBase, double vendas, double percentualComissao) {
        super(nome, salarioBase);
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (vendas * percentualComissao / 100);
    }
}