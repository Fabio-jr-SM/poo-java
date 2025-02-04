package br.com.localiza.estacionamento;

public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String placa, String marca, String modelo, int anoFabricacao, int cilindradas) {
        super(placa, marca, modelo, anoFabricacao);
        if (cilindradas <= 0) {
            throw new IllegalArgumentException("As cilindradas devem ser maiores que zero.");
        }
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        if (cilindradas > 0) {
            this.cilindradas = cilindradas;
        } else {
            System.out.println("Cilindradas inválidas.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Moto | Cilindradas: " + cilindradas;
    }
}
