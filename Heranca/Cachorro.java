package Exercicios.Heranca;

public class Cachorro extends HerançaAnimal{
	
	
	public Cachorro(String nome,int idade, String som,boolean correr,boolean subir)
	{
		super(nome,idade,som,correr,subir);
		this.correr = correr;
	}
	
	public void queAnimal()
	{
		if(correr == true || getSom() == "late")
		System.out.println("\nO cachorro "+getNome()+", tem "+getIdade()+" anos, "+getSom()+" e também corre.");
	}

}
