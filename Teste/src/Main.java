
public class Main {

	public static void main(String[] args) {
//		System.out.print("Boa noite!");

		Aluno objeto1 = new Aluno("Guilherme", "123456", 300);

//		objeto1.nome = "Guilherme";
//		objeto1.ra = "123456";
//		objeto1.valor_mensalidade = 800;

		objeto1.imprimir_aluno();
	
		
		Aluno objeto2 = new Aluno("Felipe", "654321", 554);
		
//		objeto2.nome = "Felipe";
//		objeto2.ra = "654321";
//		objeto2.valor_mensalidade = 554;
		
		objeto2.imprimir_aluno();
		
		
		Aluno objeto3 = new Aluno("Maraia", "78905", 800);
		objeto3.imprimir_aluno();

		
		Aluno objeto4 = new Aluno("Jose", "621221", 350);
		
		

	}

}
