package Exercicios.Heranca;

public class Cavalo extends HerançaAnimal {
	
	
	public Cavalo(String nome,int idade, String som,boolean correr,boolean subir)
	{
		super(nome,idade,som,correr,subir);
		this.correr = correr;
	}
	
	public void queAnimal()
	{
		if(correr == true || getSom() == "relincha")
		System.out.println("\nO cavalo "+getNome()+", tem "+getIdade()+" anos, "+getSom()+" e também corre.");
	}
}
