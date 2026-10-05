package EX_02;

public class Main {

	public static void main(String[] args) {

		Pais brasil = new Pais("BRA",
				"Brasil",  
				8515767.049);
		
		Pais mexico = new Pais("MEX", 
				"Mexico",
				8515767.049);
		
		Pais paraguai = new Pais("PY",
				"Paraguai",
				8515767.049);
		
		
		brasil.getNome();
		brasil.setNome("Brasil brasiliero");
		brasil.setPopulacao(99999);
		mexico.setPopulacao(8888888);

		
		brasil.listarPais();
		mexico.listarPais();
		paraguai.listarPais();
		
		
		
//		Pais chile = new Pais();
		
	
		
		

	}	

}
