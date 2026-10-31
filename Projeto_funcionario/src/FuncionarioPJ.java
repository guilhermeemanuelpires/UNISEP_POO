
public class FuncionarioPJ extends Funcionario {

	double salarioFinal;
	
	public FuncionarioPJ(String nome, double salarioBase) {
		super(nome, salarioBase);
	}
	
	public void calcularSalario() {
		salarioFinal = salarioBase - (salarioBase * 0.15);
	}
	
	@Override
	public void exibeSalario() {
		super.exibeSalario();
		System.out.println("Salario Final: R$" + salarioFinal);
	}
}
