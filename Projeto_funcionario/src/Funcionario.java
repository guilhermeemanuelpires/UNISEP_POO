
public class Funcionario {
	
	String nome;
	double salarioBase = 1621.00;
	
	public Funcionario(String nome, double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;
		
	}
	
	public void calcularSalario() {
		System.out.println("Calcular salario!");
	}
	
	public void exibeSalario() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario Base: R$"+ this.salarioBase);
	}
	
	

}
