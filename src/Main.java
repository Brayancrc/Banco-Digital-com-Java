
public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta poupanša = new ContaPoupanša();
		
		cc.depositar(100);
		cc.transferir(100, poupanša);
		
		cc.imprimirExtrato();
		poupanša.imprimirExtrato();

	}

}
