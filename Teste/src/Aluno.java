
public class Aluno {

	// Atributos
	String nome;
	String ra;
	float valor_mensalidade;

	// contrutores
//	public Aluno(){
//		this.nome = "NOME NÃO PRENCHIDO";
//		this.ra = "RA NÃO PRENCHIDO";
//		this.valor_mensalidade = 0;
//	}
	
	public Aluno(String nome, String ra, float valor_mensalidade){
		this.nome = nome;
		this.ra = ra;
		this.valor_mensalidade = valor_mensalidade;
	}
	
	// metodos
	public void imprimir_aluno() {
		System.out.println("----------------------------------------");
		System.out.println("Nome do Aluno: " + this.nome);
		System.out.println("RA do Aluno: " + this.ra);
		System.out.println("Valor da mensalidade: " + this.valor_mensalidade);
	}

}
