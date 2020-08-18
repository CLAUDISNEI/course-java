package entities;

public class Aluno {
	
	public String nomeAluno;
	public double notaPrimeiroTrimestre;
	public double notaSegundoTrimestre;
	public double notaTerceiroTrimestre;
	
	public double mediaAnual() {
		return notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;
	}
	
	public String resultado() {
		String situacao = (mediaAnual() >= 60) ? "APROVADO" : "REPROVADO";
		return situacao;
	}

}
