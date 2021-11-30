package Exercicios.Heranca;

public class Preguiça extends HerançaAnimal {
		

	
	public Preguiça(String nome,int idade, String som,boolean correr,boolean subir)
	{
		super(nome,idade,som,correr,subir);
		this.subir=subir;
	}
	public void queAnimal() 
	{
		if(subir == true) {
			System.out.println("\nA preguiça "+getNome()+" tem "+getIdade()+" anos, "+getSom()+" e sobe em árvores");
		}
	}
}
