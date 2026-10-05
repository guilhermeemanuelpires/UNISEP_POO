package EX_01;

public class Main {

	public static void main(String[] args) {
		Contador objeto1 = new Contador();
		
		objeto1.Incrementar();
		objeto1.Zerar();
		objeto1.Incrementar();
		objeto1.Incrementar();
		objeto1.Incrementar();

		
		System.out.println("VALOR DO CONTADOR: " 
		+ objeto1.RetornarValorContador());
		
		
		objeto1.contador = 0;
		
		
	}

}
