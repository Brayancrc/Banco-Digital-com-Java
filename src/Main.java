
public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta poupan�a = new ContaPoupan�a();
		
		cc.depositar(100);
		cc.transferir(100, poupan�a);
		
		cc.imprimirExtrato();
		poupan�a.imprimirExtrato();

	}

}
