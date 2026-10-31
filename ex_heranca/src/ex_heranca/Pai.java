package ex_heranca;

public class Pai {
	String nome_pai ;
	String sobrenome_pai;
	
	public Pai(String nome_pai , String sobrenome_pai ){
		this.nome_pai = nome_pai;
		this.sobrenome_pai = sobrenome_pai;
	}
	
	
	void exibirSobrenomePai() {
		System.out.println("NOME PAI: " 
				+ this.nome_pai);
		System.out.println("SOBRENOME PAI: " 
				+ this.sobrenome_pai);
	}
}
