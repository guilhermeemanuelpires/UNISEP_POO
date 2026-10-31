
public class FuncionarioCLT extends Funcionario {

	double salarioFinal;
	
	public FuncionarioCLT(String  nome, double salarioBase) {
		super(nome, salarioBase);
	}
	
	public void calcularSalario() {
		salarioFinal = salarioBase - (salarioBase * 0.08);
	}
	
	@Override
	public void exibeSalario() {
		super.exibeSalario();
		System.out.println("Salario Final: R$" + salarioFinal);
	}
}
