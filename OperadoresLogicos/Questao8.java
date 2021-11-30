package Exercicios.OperadoresLogicos;

import java.util.Scanner;

public class Questao8 {
	public static void main(String args[]) {
		
		float custoFabrica,imposto,percDistribuidor;
		double custoConsumidor;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("\nQual é o custo de fábrico do veículo: ");
		custoFabrica = ler.nextFloat();
		
		imposto = (custoFabrica/100)*45;
		percDistribuidor = (custoFabrica/100)*28;
		custoConsumidor = imposto+custoFabrica+percDistribuidor;
		
		System.out.println("\nO custo do veículo para o consumidor é R$"+Math.round(custoConsumidor) +".");
		
	}

}