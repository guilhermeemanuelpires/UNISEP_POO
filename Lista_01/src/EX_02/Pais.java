	package EX_02;

public class Pais {
	
	//Atributos
	private String codigo;
	private String nome;
	private int populacao;
	private double dimensao;
	
	//Construtores
	Pais(String codigo,
		String nome,
		double dimensao) {
		this.codigo = codigo;
		this.nome = nome;
		this.dimensao = dimensao;
	}
	
	//Metodos
	public void listarPais(){
		
		System.out.println("Código: " 
				+ this.codigo);
		
		System.out.println("Nome: " 
				+ this.nome);
		
		System.out.println("População: " 
				+ this.populacao);
		
		System.out.println("Dimensão: " 
				+ this.dimensao);
		
		System.out.println("");
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getPopulacao() {
		return this.populacao; 
	}
	
	public void setPopulacao( int populacao) {
		this.populacao = populacao;
	}
	

}
