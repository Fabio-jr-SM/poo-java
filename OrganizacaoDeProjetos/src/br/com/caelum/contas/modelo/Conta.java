package br.com.caelum.contas.modelo;

public class Conta {
	int numero;
	public double saldo=0.0;
	public Cliente titular;
	
	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	public boolean saca(double valor){
		if(this.saldo<valor) {
			return false;
		}else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	public boolean	transfere(Conta	destino, double valor)	{
		boolean	retirou	= this.saca(valor);
		if(retirou ==	false){
			return	false;
		}else{
			destino.deposita(valor);
			return true;
		}
	}
	
	/*void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;	
		this.saldo = novoSaldo;
	}*/

}
