
public class FuncionarioEstagiario extends Funcionario{

	double salarioFinal;
	
	public FuncionarioEstagiario(String nome, double salarioBase) {
		super(nome, salarioBase);
	}
	
	public void calcularSalario() {
		salarioFinal = salarioBase - (salarioBase * 0.05);
	}
	
	@Override
	public void exibeSalario() {
		super.exibeSalario();
		System.out.println("Salario fianl: R$" + salarioFinal);
		
	}
	
	
	
}
