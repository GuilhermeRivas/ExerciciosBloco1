package HelloWorld;

public class ClasseObjeto1 {
	
	/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.	
	*/
	
	public String nomeCliente;
	public float busto;
	public float cintura;
	public float altura;
	
	public ClasseObjeto1(String nomeCliente,float busto,float cintura,float altura)
	{
		this.nomeCliente = nomeCliente;
		this.busto = busto;
		this.cintura = cintura;
		this.altura = altura;
	}	
		
	
	public ClasseObjeto1(String nomeCliente)
	{
	
	
		this.nomeCliente = nomeCliente;
	}
	
	public void imprimirInfo()
	{
		if(busto == 0 || cintura == 0 || altura == 0)
		{
			System.out.println("\n A(O) cliente "+nomeCliente+" ainda não tirou as medidas.");
		}
		else
		{
			System.out.println("\n A(O) cliente "+nomeCliente+" mede "+altura+"cm de altura, tem "+busto+"cm de busto, e uma cintura de "+cintura+"cm.");
		}
		
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public float getBusto() {
		return busto;
	}

	public void setBusto(float busto) {
		this.busto = busto;
	}

	public float getCintura() {
		return cintura;
	}

	public void setCintura(float cintura) {
		this.cintura = cintura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
}
