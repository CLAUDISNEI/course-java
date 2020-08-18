package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class ProgramaAlunos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.print("ALUNO: ");
		aluno.nomeAluno = sc.nextLine();
		System.out.println();
		
		System.out.print("Nota do 1º trimestre: ");
		aluno.notaPrimeiroTrimestre = sc.nextDouble();
		
		System.out.print("Nota do 2º trimestre: ");
		aluno.notaSegundoTrimestre = sc.nextDouble();
		
		System.out.print("Nota do 3º trimestre: ");
		aluno.notaTerceiroTrimestre = sc.nextDouble();
		System.out.println();
		
		
		
		if(aluno.resultado()=="APROVADO") {
			System.out.printf("NOTA FINAL: %.2f %n", aluno.mediaAnual());
			System.out.println("APROVADO");
		}else {
			System.out.printf("NOTA FINAL: %.2f %n", aluno.mediaAnual());
			System.out.println("REPROVADO");
			System.out.printf("FALTARAM: %.2f pontos", 60 - aluno.mediaAnual());
		}
		
		
		
	}

}
