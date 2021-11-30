package Exercicios.OperadoresLogicos;

import java.util.Scanner;

public class Questao5 {
	public static void main(String args[]) {
		
		float n1,n2,n3,media;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEscreva a primeira nota: ");
		n1 = ler.nextFloat() * 2;
		System.out.println("\nEscreva a segunda nota: ");
		n2 = ler.nextFloat() * 3;
		System.out.println("\nEscreva a terceira nota: ");
		n3 = ler.nextFloat() * 5;
		
		media = (n1+n2+n3)/10;
		
		System.out.println("\nA média do alune é :"+media+".");
				
	}

}
