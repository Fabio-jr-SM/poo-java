package capitulo04;

public class Conta {
	int numero;
	double saldo=0.0;
	Cliente titular;
	
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	boolean saca(double valor){
		if(this.saldo<valor) {
			return false;
		}else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	boolean	transfere(Conta	destino, double valor)	{
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
