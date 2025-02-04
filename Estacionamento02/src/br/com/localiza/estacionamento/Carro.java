package br.com.localiza.estacionamento;

public class Carro extends Veiculo {

    private int quantidadePortas;

    public Carro(String placa, String marca, String modelo, int anoFabricacao, int quantidadePortas) {
        super(placa, marca, modelo, anoFabricacao);
        if (quantidadePortas <= 0) {
            throw new IllegalArgumentException("O carro deve ter pelo menos uma porta.");
        }
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        if (quantidadePortas > 0) {
            this.quantidadePortas = quantidadePortas;
        } else {
            System.out.println("Número de portas inválido.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Carro | Portas: " + quantidadePortas;
    }
}
