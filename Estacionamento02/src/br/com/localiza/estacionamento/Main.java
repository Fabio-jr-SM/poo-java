package br.com.localiza.estacionamento;

public class Main {

    static Veiculo[] listaVeiculo = new Veiculo[10];

    public static void main(String[] args) {
        menu();
    }

    // Alterar veículo
    public static void alterar() {
        String placa = Teclado.lerString("Digite a placa do veículo a ser alterado: ");
        for (int i = 0; i < listaVeiculo.length; i++) {
            if (listaVeiculo[i] != null && listaVeiculo[i].getPlaca().equalsIgnoreCase(placa)) {
                System.out.println("Alterando veículo: " + listaVeiculo[i]);

                listaVeiculo[i].setMarca(Teclado.lerString("Marca"));
                listaVeiculo[i].setModelo(Teclado.lerString("Modelo"));
                listaVeiculo[i].setAnoFabricacao(Teclado.lerInteiro("Ano"));

                if (listaVeiculo[i] instanceof Carro) {
                    ((Carro) listaVeiculo[i]).setQuantidadePortas(Teclado.lerInteiro("Quantidade de portas"));
                } else if (listaVeiculo[i] instanceof Moto) {
                    ((Moto) listaVeiculo[i]).setCilindradas(Teclado.lerInteiro("Cilindradas"));
                }

                System.out.println("Veículo atualizado com sucesso!");
                menu();
                return;
            }
        }
        System.out.println("Placa não encontrada!");
        menu();
    }

    // Menu principal
    public static void menu() {
        System.out.println("\n=========== MENU ============\n" +
                           "[1] Cadastrar\n" +
                           "[2] Alterar\n" +
                           "[3] Excluir\n" +
                           "[4] Consultar\n" +
                           "[5] Sair\n" +
                           "[6] Preencher automaticamente");

        int opcao = Teclado.lerInteiro("Opção: ");

        switch (opcao) {
            case 1: cadastrar(); break;
            case 2: alterar(); break;
            case 3: excluir(); break;
            case 4: consultar(); break;
            case 5: System.exit(0);
            case 6: preencherAutomaticamente(); break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
                menu();
        }
    }
    
    // Excluir veículo
    public static void excluir() {
        String placaExcluir = Teclado.lerString("Digite a placa do veículo a ser excluído: ");
        
        for (int i = 0; i < listaVeiculo.length; i++) {
            if (listaVeiculo[i] != null && listaVeiculo[i].getPlaca().equalsIgnoreCase(placaExcluir)) {
                listaVeiculo[i] = null;
                System.out.println("Veículo excluído com sucesso!");
                menu();
                return;
            }
        }
        System.out.println("Placa não encontrada!\n");
        menu();
    }

    // Cadastrar veículo
    public static void cadastrar() {
        int tipoVeiculo = Teclado.lerInteiro("Tipo de veículo (1-Moto | 2-Carro): ");
        String placa = Teclado.lerString("Placa");
        String marca = Teclado.lerString("Marca");
        String modelo = Teclado.lerString("Modelo");
        int anoFabricacao = Teclado.lerInteiro("Ano");

        Veiculo veiculo = null;

        if (tipoVeiculo == 1) {
            int cilindradas = Teclado.lerInteiro("Cilindradas");
            veiculo = new Moto(placa, marca, modelo, anoFabricacao, cilindradas);
        } else if (tipoVeiculo == 2) {
            int quantidadePortas = Teclado.lerInteiro("Quantidade de portas");
            veiculo = new Carro(placa, marca, modelo, anoFabricacao, quantidadePortas);
        } else {
            System.out.println("Opção inválida! Retornando ao menu.");
            menu();
            return;
        }

        if (adicionarVeiculo(veiculo)) {
            System.out.println("Veículo cadastrado com sucesso!");
        } else {
            System.out.println("Não há espaço para mais veículos!");
        }
        menu();
    }

    // Adicionar veículo à lista
    public static boolean adicionarVeiculo(Veiculo v) {
        for (int i = 0; i < listaVeiculo.length; i++) {
            if (listaVeiculo[i] == null) {
                listaVeiculo[i] = v;
                return true;
            }
        }
        return false;
    }

    // Consultar veículos cadastrados
    public static void consultar() {
        boolean encontrou = false;
        for (Veiculo veiculo : listaVeiculo) {
            if (veiculo != null) {
                System.out.println(veiculo);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum veículo cadastrado!");
        }
        menu();
    }

    // Preencher lista automaticamente
    public static void preencherAutomaticamente() {
        Veiculo[] exemplos = {
            new Carro("ABC-1234", "Toyota", "Corolla", 2022, 4),
            new Carro("DEF-5678", "Honda", "Civic", 2021, 4),
            new Carro("GHI-9101", "Ford", "Fiesta", 2019, 4),
            new Moto("JKL-2345", "Yamaha", "YZF-R3", 2020, 320),
            new Moto("MNO-6789", "Honda", "CB 500F", 2021, 500),
            new Moto("PQR-1122", "Suzuki", "GSX-S750", 2022, 749)
        };

        int adicionados = 0;
        for (Veiculo veiculo : exemplos) {
            if (adicionarVeiculo(veiculo)) {
                adicionados++;
            } else {
                break;  // Para de tentar adicionar quando a lista estiver cheia
            }
        }

        System.out.println(adicionados + " veículos adicionados automaticamente!");
        menu();
    }
}
