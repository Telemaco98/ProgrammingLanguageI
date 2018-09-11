package quest1;

/**
 * Class for conta bancaria.
 * 
 * @author 	Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 18.07.2017
 */
public class ContaBancaria {
	private String nome;
	private int conta;
	private double saldo;

	/**
	 * Constructs the object.
	 *
	 * @param      nome          The nome
	 * @param      conta         The conta
	 * @param      saldoInicial  The saldo inicial
	 */
	public ContaBancaria (String nome, int conta, double saldoInicial) {
		this.nome = nome;
		this.conta = conta;
		saldo = saldoInicial;
	}

	/**
	 * Gets the name.
	 * @return  nome - The name of the owner.
	 */
	public String getNome () {
		return nome;
	}

	/**
	 * Gets the account number.
	 * @return conta - The account number.
	 */
	public int getConta () {
		return conta;
	}

	/**
	 * Gets the balance of the bank account.
	 * @return saldo - Bank account balance
	 */
	public double saldo () {
		return saldo;
	}

	/**
	 * Print the Bank statement of the account
	 */
	public void extrato () {
		System.out.println("\tEXTRATO");
		System.out.println(" Nome: " + this.nome);
		System.out.println(" Número da conta: " + this.conta);
		System.out.println(" Saldo atual: " + this.saldo + "\n");
	}

	/**
	 * Method to cash out of the bank account
	 * @param 	valor - The value to drawout
	 * @throws 	Exception in case if the user want cash out a value that it can't do it.
	 */
	public void sacar (double valor) throws ParametroException {
		if (valor < 0) {
			throw new ParametroException(" Parâmetro inválido: valor negativo");
		}else if (valor > saldo) {
			throw new ParametroException(" Parâmetro inválido: valor solicitado maior que o saldo disponível");
		} else if (saldo >= valor) {
			saldo -= valor;
			System.out.println(" Sacado: " + valor);
			System.out.println(" Novo saldo: " + saldo + "\n");
		}
	}

	/**
	 * Method to deposit cash in the account bank
	 * @param valor - The value to deposit
	 * @throws 	Exception in case if the user want cash out a value that it can't do it.
	 */
	public void depositar (double valor) throws ParametroException {
		if(valor < 0) {
			throw new ParametroException(" Parâmetro inválido: valor negativo");
		} else {
			saldo += valor;
			System.out.println(" Depositado: " + valor);
			System.out.println(" Novo saldo: " + saldo + "\n");
		}
	}
}