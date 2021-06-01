package entities;


public class Funcionario 
{
	private String nome;
	private float salarioBruto;
	private float totalAcrescimos;
	private float totalDescontos;
	
	
	public Funcionario(String nome, float salarioBruto, float totalAcrescimos, float totalDescontos)
	{
		setNome(nome);
		setSalarioBruto(salarioBruto);
		setTotalAcrescimos(totalAcrescimos);
		setTotalDescontos(totalDescontos);
	}
	
	public String getNome()
	{
		return this.nome;
	}
		
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public float getSalarioBruto()
	{
		return this.salarioBruto;
	}
	
	public void setSalarioBruto(float salarioBruto)
	{
		this.salarioBruto = salarioBruto;
	}
	
	public float getTotalAcrescimos()
	{
		return this.totalAcrescimos;
	}
	
	public void setTotalAcrescimos(float totalAcrescimos)
	{
		this.totalAcrescimos = totalAcrescimos;
	}
	
	public float getTotalDescontos()
	{
		return this.totalDescontos;
	}
	
	public void setTotalDescontos(float totalDescontos)
	{
		this.totalDescontos = totalDescontos;
	}

	public float salarioLiquido()
	{
		return (this.salarioBruto + this.totalAcrescimos - this.totalDescontos);
	}
			
}






