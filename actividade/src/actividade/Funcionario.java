package actividade;
import java.util.Scanner;

public class Funcionario {
    Scanner scanner = new Scanner(System.in);
    int matricula;
    String nome;
    double salario;
    
    public void cadastrarFuncionario(int matriculaCad, String nomeCad, double salarioCad) {
        nome = nomeCad;
        salario = salarioCad;
        matricula = matriculaCad;
    }
    
    public void atualizarFuncionario() {        
        System.out.println("Digite a nova matrícula: ");
        matricula = scanner.nextInt();
        scanner.nextLine(); // Limpeza de buffer
        
        System.out.println("Digite o novo nome do funcionário: ");
        nome = scanner.nextLine();
        
        System.out.println("Digite o novo salário: ");
        salario = scanner.nextDouble();
    }
    
    public void consultaFuncionario() {
        System.out.printf("%-10d %-20s %-10.2f\n", matricula, nome, salario);
    }    
}
