package Exercicios.OperadoresLogicos;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		int ano,mes,dias,totalDias;
		Scanner ler = new Scanner(System.in);
		System.out.println("\nQuantos anos de idade você tem?");
		ano = ler.nextInt();
		System.out.println("\nE quantos meses?");
		mes = ler.nextInt();
		System.out.println("\nQuantos dias?");
		dias = ler.nextInt();
		
		totalDias = (ano*365)+(mes*30)+dias;
		
		System.out.println("\n Você tem "+totalDias+" dia(s) de vida.");
				
				
		
		
		
	}

}
