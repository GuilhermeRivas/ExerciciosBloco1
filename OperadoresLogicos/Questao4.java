package Exercicios.OperadoresLogicos;
import java.util.Scanner;

public class Questao4 {
public static void main(String args[]) {
	
	int A,B,C;
	double R,S,D;
	Scanner ler = new Scanner(System.in);
	System.out.println("Escreva o valor de A: ");
	A = ler.nextInt();
	System.out.println("Escreva o valor de B: ");
	B = ler.nextInt();
	System.out.println("Escreva o valor de B: ");
	C = ler.nextInt();
	
	R = Math.pow(A+B, 2);
	S = Math.pow(B+C, 2);
	D = (R+S)/2;
	
	System.out.println("Os valores de R, S e D, são respectivamente: "+R+", "+S+", "+D+".");
	
			
	
}
}
