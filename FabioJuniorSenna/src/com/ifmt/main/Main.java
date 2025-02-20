package com.ifmt.main;

import com.ifmt.service.GerenciamentoFuncionarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciamentoFuncionarios gerenciamento = new GerenciamentoFuncionarios();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Sistema de Gerenciamento de Funcionários ---");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Calcular Salário de um Funcionário");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    gerenciamento.cadastrarFuncionario();
                    break;
                case 2:
                    gerenciamento.listarFuncionarios();
                    break;
                case 3:
                    gerenciamento.calcularSalarioFuncionario();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }
}