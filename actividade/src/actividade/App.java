/*
 * Você foi contratado para fazer um sistema de gestão de pessoas. Sua função é criar o 
 * cadastro de Funcionário da Empresa. O cadastro possui inserção, atualização, 
 * exclusão e consulta de todos os funcionários da empresa. Todo Funcionário possui 
 * uma matrícula, nome e salário.
 * Seu cadastro deve contemplar até 10 Funcionários.  
*/

package actividade;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario[] listaFuncionario = new Funcionario[10];
        
        int op, matricula;
        
        while (true) {
            System.out.println("=====MENU=======\n" +
                               "1. Cadastrar Funcionario\n" +
                               "2. Alterar Funcionario\n" +
                               "3. Consultar Funcionario\n" +
                               "4. Excluir Funcionario\n" +
                               "0. Sair");
            
            op = scanner.nextInt();
            
            switch (op) {
                case 1: {
                    // Cadastrar funcionário
                    for (int i = 0; i < listaFuncionario.length; i++) {
                        if (listaFuncionario[i] == null) {
                            listaFuncionario[i] = new Funcionario();
                            
                            int matriculaCad;
                            System.out.println("Digite a matrícula: ");
                            matriculaCad = scanner.nextInt(); 
                            scanner.nextLine(); // Limpeza de buffer


                            String nomeCad;
                            System.out.println("Digite a matrícula: ");
                            nomeCad = scanner.nextLine(); 


                            double salarioCad;
                            System.out.println("Digite a matrícula: ");
                            salarioCad = scanner.nextDouble(); 


                            listaFuncionario[i].cadastrarFuncionario(matriculaCad,nomeCad,salarioCad);
                            System.out.println("Funcionario cadastrado com sucesso!");
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    // Atualizar funcionário
                    System.out.println("Digite a matrícula do funcionário: ");
                    matricula = scanner.nextInt();
                    boolean found = false; //Variavel auxiliar
                    for (int i = 0; i < listaFuncionario.length; i++) {
                        if (listaFuncionario[i] != null && listaFuncionario[i].matricula == matricula) {
                            listaFuncionario[i].atualizarFuncionario();
                            System.out.println("Funcionario atualizado com sucesso!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Funcionário não encontrado!");
                    }
                    break;
                }
                case 3: {
                    // Consultar funcionário
                	System.out.println();
                    System.out.printf("%-10s %-20s %-10s\n", "Matrícula", "Nome", "Salário");
                    System.out.println("---------------------------------------------");
                    for (Funcionario funcionario : listaFuncionario) {
                        if (funcionario != null) {
                            funcionario.consultaFuncionario();
                        }
                    }
                    break;
                }
                case 4: {
                    // Excluir funcionário
                    System.out.println("Digite a matrícula do funcionário: ");
                    matricula = scanner.nextInt();
                    boolean deleted = false; 
                    for (int i = 0; i < listaFuncionario.length; i++) {
                        if (listaFuncionario[i] != null && listaFuncionario[i].matricula == matricula) {
                            listaFuncionario[i] = null;
                            System.out.println("Funcionário excluído com sucesso!");
                            deleted = true;
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Funcionário não encontrado!");
                    }
                    break;
                }
                case 0: {
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
