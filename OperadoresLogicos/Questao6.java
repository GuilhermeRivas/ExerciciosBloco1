package Exercicios.OperadoresLogicos;

import java.util.Scanner;

public class Questao6 {
public static void main(String args[]) {
	
	float x1,x2,y1,y2;
	double d;
	
	Scanner ler = new Scanner(System.in);
	System.out.println("\nDe a posição no eixo x do primeiro ponto: ");
	x1 = ler.nextFloat();
	System.out.println("\nDe a posição no eixo y do primeiro ponto: ");
	y1 = ler.nextFloat();
	System.out.println("\nDe a posição no eixo x do segundo ponto: ");
	x2 = ler.nextFloat();
	System.out.println("\nDe a posição no eixo y do segundo ponto: ");
	y2 = ler.nextFloat();
	
	d = Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2));
	
	System.out.println("\nO valor de d é :"+d+".");
}
}
