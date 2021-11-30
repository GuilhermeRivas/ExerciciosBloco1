package Exercicios.Heranca;

public class HerançaAnimal {
	
	private String nome;
	private int idade;
	private String som;
	protected boolean subir;
	protected boolean correr;
	
	public HerançaAnimal(String nome,int idade, String som,boolean subir,boolean correr)
	{
		this.nome = nome;
		this.idade = idade;
		this.subir = subir;
		this.correr = correr;
		this.som = som;
	}
	
	public void queAnimal()
	{
		
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public boolean isSubir() {
		return subir;
	}

	public void setSubir(boolean subir) {
		this.subir = subir;
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	

}
