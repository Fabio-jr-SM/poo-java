/*
 * 
 * PAGINA 68 - Capitulo 05	MODIFICADORES	DE	ACESSO E ATRIBUTOS DE CLASSE
 * 
 * */

package capitulo04;

public class Programa {

	public static void main(String[] args) {
		 
		Conta c1 = new Conta();
		Cliente t1 = new Cliente();
		
		Conta c2 = new Conta();
		Cliente t2 = new Cliente();
		
		c1.titular = t1;
		c2.titular = t2;
		
		c1.titular.nome = "Fábio";
		c1.saldo = 10000;
		
		c2.titular.nome = "Junior";
		c2.saldo = 10000;
		
		System.out.println("Saldo atual: "+c1.saldo);
		
		boolean isValid = c1.saca(110000);
		c1.deposita(5000);
		if (isValid) {
			System.out.println("Saldo atual após operações: "+c1.saldo);					
		}else {
			System.out.println("Saldo insuficiente para sacar"
					+ "\nSaldo atual: "+c1.saldo);						
		}
		
		c1.transfere(c2,50);	
	}

}
