package com.amazon.alpha.inventario;

import com.amazon.alpha.dispositivos.Dispositivo;
import com.amazon.alpha.dispositivos.Computador;
import com.amazon.alpha.dispositivos.Smartphone;

import java.util.ArrayList;
import java.util.Scanner;

public class InventarioDispositivos {
    private static ArrayList<Dispositivo> dispositivos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- Sistema de Gerenciamento de Dispositivos ---");
            System.out.println("1. Cadastrar Dispositivo");
            System.out.println("2. Alterar Dados de um Dispositivo");
            System.out.println("3. Excluir Dispositivo");
            System.out.println("4. Consultar Dispositivos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    cadastrarDispositivo();
                    break;
                case 2:
                    alterarDispositivo();
                    break;
                case 3:
                    excluirDispositivo();
                    break;
                case 4:
                    consultarDispositivos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void cadastrarDispositivo() {
        System.out.println("\n--- Cadastrar Dispositivo ---");
        System.out.print("Digite o tipo de dispositivo (1 - Computador, 2 - Smartphone): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        System.out.print("Código de Identificação: ");
        String codigo = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ano de Fabricação: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        if (tipo == 1) {
            System.out.print("Capacidade de RAM (GB): ");
            int ram = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha
            dispositivos.add(new Computador(codigo, marca, modelo, ano, ram));
        } else if (tipo == 2) {
            System.out.print("Sistema Operacional: ");
            String so = scanner.nextLine();
            dispositivos.add(new Smartphone(codigo, marca, modelo, ano, so));
        } else {
            System.out.println("Tipo de dispositivo inválido!");
        }
    }

    private static void alterarDispositivo() {
        System.out.println("\n--- Alterar Dados de um Dispositivo ---");
        System.out.print("Digite o código de identificação do dispositivo: ");
        String codigo = scanner.nextLine();

        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo.getCodigoIdentificacao().equals(codigo)) {
                System.out.print("Nova Marca: ");
                String marca = scanner.nextLine();
                System.out.print("Novo Modelo: ");
                String modelo = scanner.nextLine();
                System.out.print("Novo Ano de Fabricação: ");
                int ano = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha

                dispositivo.setMarca(marca);
                dispositivo.setModelo(modelo);
                dispositivo.setAnoFabricacao(ano);

                if (dispositivo instanceof Computador) {
                    System.out.print("Nova Capacidade de RAM (GB): ");
                    int ram = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    ((Computador) dispositivo).setCapacidadeRAM(ram);
                } else if (dispositivo instanceof Smartphone) {
                    System.out.print("Novo Sistema Operacional: ");
                    String so = scanner.nextLine();
                    ((Smartphone) dispositivo).setSistemaOperacional(so);
                }

                System.out.println("Dispositivo alterado com sucesso!");
                return;
            }
        }
        System.out.println("Dispositivo não encontrado!");
    }

    private static void excluirDispositivo() {
        System.out.println("\n--- Excluir Dispositivo ---");
        System.out.print("Digite o código de identificação do dispositivo: ");
        String codigo = scanner.nextLine();

        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo.getCodigoIdentificacao().equals(codigo)) {
                dispositivos.remove(dispositivo);
                System.out.println("Dispositivo excluído com sucesso!");
                return;
            }
        }
        System.out.println("Dispositivo não encontrado!");
    }

    private static void consultarDispositivos() {
        System.out.println("\n--- Lista de Dispositivos ---");
        for (Dispositivo dispositivo : dispositivos) {
            System.out.println(dispositivo);
        }
    }
}