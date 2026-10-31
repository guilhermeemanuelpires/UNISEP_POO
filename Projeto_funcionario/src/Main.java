
public class Main {

	public static void main(String[] args) {
		
		FuncionarioCLT guilherme = new FuncionarioCLT("Guilherme", 1639.25);
		guilherme.calcularSalario();
		guilherme.exibeSalario();
		
		FuncionarioEstagiario fabiano = new FuncionarioEstagiario("Fabiano", 3600.76);
		fabiano.calcularSalario();
		fabiano.exibeSalario();
		
		FuncionarioPJ mateus = new FuncionarioPJ("Mateus", 8900.00);
		mateus.calcularSalario();
		mateus.exibeSalario();

	}

}
