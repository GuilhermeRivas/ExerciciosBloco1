package Exercicios.Heranca;

public class Pregui�a extends Heran�aAnimal {
		

	
	public Pregui�a(String nome,int idade, String som,boolean correr,boolean subir)
	{
		super(nome,idade,som,correr,subir);
		this.subir=subir;
	}
	public void queAnimal() 
	{
		if(subir == true) {
			System.out.println("\nA pregui�a "+getNome()+" tem "+getIdade()+" anos, "+getSom()+" e sobe em �rvores");
		}
	}
}
