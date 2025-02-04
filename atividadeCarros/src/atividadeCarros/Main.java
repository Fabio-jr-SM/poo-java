package atividadeCarros;

public class Main {

	static Veiculo[] listaVeiculo = new Veiculo[10];
	
	public static void main(String[] args) {
		menu();
	}
	
	public static void alterar() {
		String placa = Teclado.lerString("Placa");
		for (int i = 0; i < listaVeiculo.length; i++) {
			if(listaVeiculo[i] != null && listaVeiculo[i].getPlaca().equals(placa)) {
				if(listaVeiculo[i] instanceof Carro) {
					Carro carro = (Carro)listaVeiculo[i];
					String marca = Teclado.lerString("Marca");
					String modelo = Teclado.lerString("Modelo");
					int anoFabricacao = Teclado.lerInteiro("Ano");
					int quatidadePortas = Teclado.lerInteiro("Portas");
					carro.setMarca(marca);
					carro.setModelo(modelo);
					carro.setAnoFabricacao(anoFabricacao);
					carro.setQuantidadePortas(quatidadePortas);
					
				} else if(listaVeiculo[i] instanceof Moto) {
					Moto moto = (Moto)listaVeiculo[i];
					String marca = Teclado.lerString("Marca");
					String modelo = Teclado.lerString("Modelo");
					int anoFabricacao = Teclado.lerInteiro("Ano");
					int cilindradas = Teclado.lerInteiro("Cilindradas");
					moto.setMarca(marca);
					moto.setModelo(modelo);
					moto.setAnoFabricacao(anoFabricacao);
					moto.setCilindradas(cilindradas);		
				}
			}
		}
		menu();
	}
	public static void menu() {
		
		int opcao = Teclado.lerInteiro("1-I 2-A 3-E 4-C 5-S");
		switch (opcao) {
		case 1:
			cadastrar();
			break;
		case 2:
			alterar();
			break;
		case 4:
			consultar();
			break;
		case 5:
			System.exit(0);

		default:
			break;
		}
	}
	
	public static void cadastrar() {
		int tipoVeiculo = Teclado.lerInteiro("1-Moto 2-Carro");
		switch (tipoVeiculo) {
		case 1:
			String placa = Teclado.lerString("Placa");
			String marca = Teclado.lerString("Marca");
			String modelo = Teclado.lerString("Modelo");
			int anoFabricacao = Teclado.lerInteiro("Ano");
			int cilindradas = Teclado.lerInteiro("Cilindradas");

			Moto moto = new Moto(placa, marca, modelo, anoFabricacao, cilindradas);
			
			for (int i = 0; i < listaVeiculo.length; i++) {
				if(listaVeiculo[i] == null) {
					listaVeiculo[i] = moto;
					break;
				}
			}
			break;
		case 2:
			placa = Teclado.lerString("Placa");
			marca = Teclado.lerString("Marca");
			modelo = Teclado.lerString("Modelo");
			anoFabricacao = Teclado.lerInteiro("Ano");
			int quantidadePortas = Teclado.lerInteiro("Portas");

			Carro carro = new Carro(placa, marca, modelo, anoFabricacao, quantidadePortas);
			
			for (int i = 0; i < listaVeiculo.length; i++) {
				if(listaVeiculo[i] == null) {
					listaVeiculo[i] = carro;
					break;
				}
			}
			break;

		default:
			break;
		}
		menu();
	}
	public static void consultar() {
		
		for (int i = 0; i < listaVeiculo.length; i++) {
			if(listaVeiculo[i] != null) {
				System.out.println(listaVeiculo[i]);
			}
		}
		menu();
	}
}
