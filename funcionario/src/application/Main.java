package application;
import entities.Funcionario;

public class Main {

	public static void main(String[] args) 
	{
		Funcionario f1 = new Funcionario("Maria", 3500, 200, 500);
		Funcionario f2 = new Funcionario("João", 3100, 100, 500);
		
		
		System.out.println(f1.getNome() + ":\n");
		System.out.println("Salário bruto: R$ " + f1.getSalarioBruto());
		System.out.println("Total de acréscimos: R$ " + f1.getTotalAcrescimos());
		System.out.println("Total de descontos: R$ " + f1.getTotalDescontos());
		System.out.println("Salário líquido: R$ " + f1.salarioLiquido() + "\n\n");
		
		System.out.println(f2.getNome() + ":\n");
		System.out.println("Salário bruto: R$ " + f2.getSalarioBruto());
		System.out.println("Total de acréscimos: R$ " + f2.getTotalAcrescimos());
		System.out.println("Total de descontos: R$ " + f2.getTotalDescontos());
		System.out.println("Salário líquido: R$ " + f2.salarioLiquido() + "\n\n");
	}

}
