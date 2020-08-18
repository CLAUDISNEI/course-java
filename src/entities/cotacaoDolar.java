package entities;

public class cotacaoDolar {
	
	public static double IOF = 6.00;
	
	public static double simulador(double cotacao, double quantidadeDolares) {
		return  (cotacao * quantidadeDolares * IOF /100)+(cotacao * quantidadeDolares) ;
	}

}
