package main;
import br.edu.ifmt.cba.OrganizacaoDeProjetos.pessoa.*;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João");
        PessoaController controller = new PessoaController();
        controller.exibirPessoa(pessoa);
    }
}
