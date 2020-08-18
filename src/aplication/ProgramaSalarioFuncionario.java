package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramaSalarioFuncionario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		
		
		System.out.print("Salário Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		System.out.println();
		
		System.out.print("Empregado: " );
		System.out.print(funcionario.toString());
		System.out.println();
		
		System.out.print("Qual o percentual de aumento: ");
		funcionario.aumentarSalario(sc.nextDouble());
		System.out.println();
		
		System.out.print("Dados alterados para: ");
		System.out.print(funcionario.toString());
		
		
		
		
		sc.close();

	}

}
