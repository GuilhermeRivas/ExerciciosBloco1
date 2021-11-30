package Exercicios.OperadoresLogicos;

import java.util.Scanner;

public class Questao2 {
	

	public static void main(String args[]) {
	
	int ano,mes,dia,totalDias;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("\nQuantos dias você tem de idade?");
	totalDias = ler.nextInt();
	
	ano = totalDias/365;
	mes = (totalDias%365)/30;
	dia = (totalDias%365)%30;
	
	System.out.println("\nVocê tem "+ano+" ano(s), "+mes+" mes(es) e "+dia+" dia(s) de vida.");
			
			
	}
}
