package quest1;

/**
 * Main class to do the execution others class
 * 
 * @author 	Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 18.07.2017
 */
public class Main {
	public static void main(String[] args) {
		GerenciarContas gc = new GerenciarContas ();
		ContaBancaria c1 = new ContaBancaria("Joao Lucas", 1234, 0);
		ContaBancaria c2 = new ContaBancaria("Shirley Ohara", 2345, 1000.99);

		gc.armazenarConta(c1);
		gc.armazenarConta(c1);
		gc.armazenarConta(c2);

		gc.extratoConta(c1.getConta());
		gc.extratoConta(c2.getConta());
		gc.extratoConta(122345532);

		gc.depositarConta(c1.getConta(), 100000);
		gc.depositarConta(c2.getConta(), -2112);

		gc.sacarConta(c1.getConta(), -998);
		gc.sacarConta(c2.getConta(), 400000);

		gc.removerConta(c1.getConta());
		gc.removerConta(c2.getConta());
		gc.removerConta(c2.getConta());

		// c1.sacar(10);
		// c2.sacar(10001);

		// c1.depositar(100000);
		// c1.depositar(-12);


	}
}