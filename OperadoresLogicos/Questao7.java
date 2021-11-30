package Exercicios.OperadoresLogicos;

import java.util.Scanner;

public class Questao7 {
	public static void main(String args[]) {
		
		float a,b,c,d,e,f,x,y;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("\n Escreva o valor de A:");
		a = ler.nextFloat();
		System.out.println("\n Escreva o valor de B:");
		b = ler.nextFloat();
		System.out.println("\n Escreva o valor de C:");
		c = ler.nextFloat();
		System.out.println("\n Escreva o valor de D:");
		d = ler.nextFloat();
		System.out.println("\n Escreva o valor de E:");
		e = ler.nextFloat();
		System.out.println("\n Escreva o valor de F:");
		f = ler.nextFloat();
		
		x = (c*e - b*f)/(a*e- b*d);
		y = (a*f-c*d)/(a*e-b*d);
		
		System.out.println("\n Os valores de x e y são respectivamente: "+x+" e "+y+".");
		
				
	}

}
