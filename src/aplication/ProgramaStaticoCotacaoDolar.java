package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.cotacaoDolar;


public class ProgramaStaticoCotacaoDolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dólar? : ");
		double cotacao = sc.nextDouble();
		System.out.print("Quantidade de dolares: ");
		double quantidadeDolares = sc.nextDouble();
		System.out.println();
		
		System.out.printf("Valor total em reais : %.2f",cotacaoDolar.simulador(cotacao, quantidadeDolares));
		
		
		
		sc.close();

	}

}
