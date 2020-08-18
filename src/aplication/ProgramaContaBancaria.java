package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class ProgramaContaBancaria {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria novaConta;
		
		System.out.print("Enter account number: ");
		int numero = sc.nextInt();		
		System.out.print("Enter account houder: ");
		sc.nextLine();
		String nomeCliente = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? : ");
		char depositoInical = sc.next().charAt(0);
	

		if (depositoInical == 'y') {
			System.out.print("Enter initial deposit value: ");
			double valorDeposito = sc.nextDouble();
			novaConta = new ContaBancaria(nomeCliente, numero, valorDeposito);
		}else {
			novaConta = new ContaBancaria(nomeCliente, numero);
		}
		
		
		System.out.println();		
		System.out.println("Account data: ");
		System.out.print(novaConta.toString());

		System.out.println();
		System.out.print("Enter a deposit value: ");
		novaConta.realizaDeposito(sc.nextDouble());
		System.out.println();

		System.out.println("Updated account data: ");
		System.out.println(novaConta.toString());

		System.out.print("Enter a withdraw value: ");
		novaConta.realizaSaques(sc.nextDouble());
		System.out.println();

		System.out.println("Updated account data: ");
		System.out.println(novaConta.toString());

		sc.close();
	}

}
