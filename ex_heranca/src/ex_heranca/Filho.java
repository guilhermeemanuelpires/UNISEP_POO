package ex_heranca;

public class Filho extends Pai{
	
	String sobrenome_mae;
	
	public Filho(String nome_pai, 
				String sobrenome_pai,
				String sobrenome_mae) 
	{
		super(nome_pai, sobrenome_pai);
		
		this.sobrenome_mae = sobrenome_mae;
	}
	
	
	void exibirSobrenomeMae() {
		System.out.println("SOBRENOME MAE: " + 
				this.sobrenome_mae);
		exibirSobrenomePai();
	}
	
	
}

