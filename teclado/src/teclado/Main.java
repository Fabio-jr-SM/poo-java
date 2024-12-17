package teclado;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um numero: ");
		num = scanner.nextInt();
		
		if(num%2==0) {
			System.out.println("Numero é Par");
		}else {
			System.out.println("Numero é Impar");
			
		}
	}

}
