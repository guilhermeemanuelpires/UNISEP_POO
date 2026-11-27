package mercado;

public class Main {

    public static void main(String[] args) {
    	
    	ConexaoMySql conn = new ConexaoMySql();
    	
    	ProdutoController produtoController = new ProdutoController(conn);
    	

    	Produto produto = new Produto("COCA-COLA", 8.00);
    	
    	produtoController.cadastrarProduto(produto);
    	
    	
    	Produto produto2 = new Produto("FANTA", 9.50);
    	produto2.ID = 8;
    	
    	produtoController.atualizarProduto(produto2);
    	
    	produtoController.deletarProdutos(9);
    	
    	produtoController.listarProdutos();
    	
    	
    }

}
