package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.ReservaQuartoVetor3;

public class ProgramaVetor3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ReservaQuartoVetor3[] reserva = new ReservaQuartoVetor3[10];
		
		System.out.print("Informe a quantidade de hospedes: ");
		int quantidadeCliente = sc.nextInt();
		
		for(int i=0; i<quantidadeCliente;i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email:");
			String email = sc.nextLine();
			System.out.print("Número quarto: ");
			int numQuarto = sc.nextInt();
			reserva[numQuarto] = new ReservaQuartoVetor3(nome, email, numQuarto);
		}
		
		for(int x=0;x<reserva.length; x++) {
			if(reserva[x]!= null) {
				System.out.println("Quarto: "+ reserva[x].getNumQuarto());
				System.out.println("Nome: "+ reserva[x].getNomeCliente());
				System.out.println("Email: "+ reserva[x].getEmailCliente());
			}
		}

	}

}
