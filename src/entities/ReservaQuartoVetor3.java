package entities;

public class ReservaQuartoVetor3 {

	private String nomeCliente;
	private String emailCliente;
	private int numQuarto;
	
	public ReservaQuartoVetor3(String nomeCliente, String emailCliente, int numQuarto) {
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.numQuarto = numQuarto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public int getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}
	
	
	
	
	
	
}
