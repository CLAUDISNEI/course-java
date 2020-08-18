package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoVetor;

public class ProgramaVetor2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre o número de produtos: ");
		int n = sc.nextInt();
		
		
		ProdutoVetor[] vect = new ProdutoVetor[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.print("Nome do produto: ");
			String nome = sc.nextLine();
			System.out.print("Preço produto: ");
			double preco = sc.nextDouble();
			System.out.println();
			vect[i]= new ProdutoVetor(nome, preco);
		}
		
		double mediaPrecos = 0;
		for(int x=0; x<n ; x++) {
			mediaPrecos += vect[x].getPrecoProduto();
		}
		
		System.out.printf("Média preços: %.2f ", mediaPrecos/n);
		
		
		sc.close();
	}

}
