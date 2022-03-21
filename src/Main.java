
public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta poupança = new ContaPoupança();
		
		cc.depositar(100);
		cc.transferir(100, poupança);
		
		cc.imprimirExtrato();
		poupança.imprimirExtrato();

	}

}
