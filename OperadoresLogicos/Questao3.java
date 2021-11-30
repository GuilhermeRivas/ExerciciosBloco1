package Exercicios.OperadoresLogicos;
import java.util.Scanner;

public class Questao3 {
	public static void main(String args[]) {
		
		int horas,minutos,segundos,segundosTotais;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nQuantos segundos irá durar o evento?");
		segundosTotais = ler.nextInt();
		
		horas = segundosTotais/3600;
		minutos = (segundosTotais%3600)/60;
		segundos = (segundosTotais%3600)%60;
		
		System.out.println("\nO evento irá durar "+horas+" hora(s), "+minutos+" minuto(s) e "+segundos+" segundo(s).");
		
	}

}
