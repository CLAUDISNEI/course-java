package aplication;

import java.util.Locale;
import java.util.Scanner;


public class ProgramaVetor1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de pessoas: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0;i<n;i++) {
			vect[i]= sc.nextDouble();
		}
		
		System.out.println("Media : "+ media(vect));
		
		sc.close();

	}
	
	public static double media(double[] vect) {
		double media=0;
		
		for(int i=0;i<vect.length;i++) {
			media+=vect[i];
		}
		
		return media / vect.length;
		
	}

}
