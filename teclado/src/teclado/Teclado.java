package teclado;
import java.util.Scanner;

public class Teclado {
	public static int lerInteiro(String rotulo) {
		System.out.println(rotulo);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	public static double lerDouble(String rotulo) {
		System.out.println(rotulo);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextDouble();
	}
	
	public static String lerString(String rotulo) {
		System.out.println(rotulo);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
