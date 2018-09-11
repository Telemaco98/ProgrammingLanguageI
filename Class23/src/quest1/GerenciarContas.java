package quest1;

import java.util.ArrayList;

/**
 * Class for the accounts manage.
 * 
 * @author 	Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 18.07.2017
 */
public class GerenciarContas {
	private ArrayList<ContaBancaria> contas;

	public GerenciarContas () {
		contas = new ArrayList<ContaBancaria>();
	}

	/**
	 * Method to stores the accounts
	 * @param      c     A bank account
	 */
	public void armazenarConta (ContaBancaria c) {
		if(procurarConta(c.getConta()) == null){
			contas.add(c);
			System.out.println(" Conta adicionada com suceso! ");
		}
		else {
			System.out.println(" A conta já existe ");
		}
	}

	/**
	 * Remove an account of the manage account
	 * @param      numeroConta  The account number
	 */
	public void removerConta (int numeroConta) {
		ContaBancaria c = procurarConta(numeroConta);
		if(c == null) {
			System.out.println(" A conta não existe");
			return ;
		} else {
			System.out.println(" Conta removida!");
			contas.remove(c);
		}
	}

	/**
	 * Method to deposit cash in an bank account
	 * @param      numeroConta  The numero conta
	 * @param      valor        The valor
	 */
	public void depositarConta (int numeroConta, double valor) {
		ContaBancaria c = procurarConta(numeroConta);
		if(c == null) {
			System.out.println(" A conta não existe");
			return ;
		}

		try {
			c.depositar(valor);
		} catch (ParametroException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Method to cash out of the account
	 * @param      numeroConta  The account number
	 * @param      valor        The value
	 */
	public void sacarConta (int numeroConta, double valor) {
		ContaBancaria c = procurarConta(numeroConta);
		if(c == null) {
			System.out.println(" A conta não existe");
			return ;
		}

		try {
			c.sacar(valor);
		} catch (ParametroException e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Method to show the Bank statement of an account
	 * @param numeroConta - The account number
	 */
	public void extratoConta (int numeroConta) {
		ContaBancaria c = procurarConta(numeroConta);
		if(c == null) {
			System.out.println(" A conta não existe");
			return ;
		}
		c.extrato();
	}	

	/**
	 * Method to search an account
	 * @param  numeroConta - The number account
	 * @return If find the account return it, otherwise return null
	 */
	private ContaBancaria procurarConta (int numeroConta) {
		for(ContaBancaria c : contas) {
			int numeroC = c.getConta();
			if(numeroC == numeroConta){
				return c;
			}
		}
		return null;
	}
}