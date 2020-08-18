package entities;

public class ContaBancaria {
	
	private String nomeCliente;
	private int numeroConta;
	private double saldoConta;
	
	public ContaBancaria(String nomeCliente, int numeroConta) {
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
	}
	
	public ContaBancaria(String nomeCliente, int numeroConta, double saldoConta) {
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
		realizaDeposito(saldoConta);
	}
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}
	
	public void realizaDeposito(double valorDeposito) {
		saldoConta += valorDeposito;
	}
	
	public void realizaSaques(double valorSaque) {
		saldoConta -= valorSaque + 5.00;
	}

	public String toString() {
		return "Account "
				+getNumeroConta()
			    +", Holder: "
			    + getNomeCliente()
			    + ", Balance: $ "
			    +String.format("%.2f", getSaldoConta());
	}
	
	
	
	
	

}
