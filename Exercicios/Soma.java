import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;

        System.out.println("Digite dois numeros: ");
        a = scanner.nextInt();
        
        System.out.println("Digite dois numeros: ");
        b = scanner.nextInt();
        int soma = a+b;

        System.out.println(soma);

        
    }
}

