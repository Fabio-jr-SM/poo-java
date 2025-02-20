package com.ifmt.service;

import com.ifmt.model.Funcionario;
import com.ifmt.model.FuncionarioComissionado;
import com.ifmt.model.FuncionarioHorista;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoFuncionarios {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void cadastrarFuncionario() {
        System.out.println("\n--- Cadastrar Funcionário ---");
        System.out.println("1. Funcionário Horista");
        System.out.println("2. Funcionário Comissionado");
        System.out.print("Escolha o tipo de funcionário: ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Salário Base: ");
        double salarioBase = scanner.nextDouble();

        if (tipo == 1) {
            System.out.print("Horas Trabalhadas: ");
            int horasTrabalhadas = scanner.nextInt();
            System.out.print("Valor por Hora: ");
            double valorHora = scanner.nextDouble();
            funcionarios.add(new FuncionarioHorista(nome, salarioBase, horasTrabalhadas, valorHora));
        } else if (tipo == 2) {
            System.out.print("Vendas: ");
            double vendas = scanner.nextDouble();
            System.out.print("Percentual de Comissão (%): ");
            double percentualComissao = scanner.nextDouble();
            funcionarios.add(new FuncionarioComissionado(nome, salarioBase, vendas, percentualComissao));
        } else {
            System.out.println("Tipo de funcionário inválido!");
        }
    }

    public void listarFuncionarios() {
        System.out.println("\n--- Lista de Funcionários ---");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Salário Base: " + funcionario.getSalarioBase());
        }
    }

    public void calcularSalarioFuncionario() {
        System.out.println("\n--- Calcular Salário de um Funcionário ---");
        System.out.print("Nome do Funcionário: ");
        String nome = scanner.nextLine();

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Salário Calculado: " + funcionario.calcularSalario());
                return;
            }
        }
        System.out.println("Funcionário não encontrado!");
    }
}