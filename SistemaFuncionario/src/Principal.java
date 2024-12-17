
public class Principal {

	public static void main(String[] args) {

		Funcionario[] listaFuncionario = new Funcionario[10];

		while (true) {
			int operacao = Teclado.lerInteiro("1-Cad 2-Alt 3-Exc 4-Cons 5-Sair");
			
			
			switch (operacao) {
			case 1:
				int matricula = Teclado.lerInteiro("Digite a matr�cula: ");
				String nome = Teclado.lerString("Digite o nome: ");
				double salario = Teclado.lerDouble("Digite o sal�rio: ");
				Funcionario funcionario = new Funcionario();
				funcionario.matricula = matricula;
				funcionario.nome = nome;
				funcionario.salario = salario;
				for (int i = 0; i < listaFuncionario.length; i++) {
					if (listaFuncionario[i] == null) {
						listaFuncionario[i] = funcionario;
						System.out.println("Funcion�rio inclu�do com sucesso!");
						break;
					}
				}
				break;
			case 2:
				matricula = Teclado.lerInteiro("Digite a matr�cula: ");
				nome = Teclado.lerString("Digite o novo nome: ");
				salario = Teclado.lerDouble("Digite o novo sal�rio: ");
				for (int i = 0; i < listaFuncionario.length; i++) {
					if (listaFuncionario[i] != null && listaFuncionario[i].matricula == matricula) {
						listaFuncionario[i].nome = nome;
						listaFuncionario[i].salario = salario;
						System.out.println("Funcion�rio alterado com sucesso!");
						break;
					}
				}
				break;
			case 3:
				matricula = Teclado.lerInteiro("Digite a matr�cula: ");
				for (int i = 0; i < listaFuncionario.length; i++) {
					if (listaFuncionario[i] != null && listaFuncionario[i].matricula == matricula) {
						listaFuncionario[i] = null;
						System.out.println("Funcion�rio exclu�do com sucesso!");
						break;
						
					}
				}
				break;
			case 4:
				for (int i = 0; i < listaFuncionario.length; i++) {
					if (listaFuncionario[i] != null) {
						System.out.println(listaFuncionario[i].verInformacoes());
					}
				}
				break;
			case 5:
				System.out.println("Sair do sistema!");
				System.exit(0);
				break;

			default:
				break;
			}
		}

	}
}
