package calculadora_heranca;

public class Calculadora {
	
	double valor1=0;
	double valor2=0;
	
	public Calculadora(double valor1, double valor2) {
		
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	public void soma() {
		System.out.println("Executar operação soma!");
	}
	
	public void subtracao() {
		System.out.println("Executar operação subtração");
	}
	
	public void multiplicacao(){
		System.err.println("Executar operação multiplicação");
	}
	
	public void divisao(){
		System.out.println("Executar oepração divisão");
	}

}
