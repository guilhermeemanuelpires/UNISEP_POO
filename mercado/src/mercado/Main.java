package mercado;

public class Main {

    public static void main(String[] args) {
    	
    	ConexaoMySql conn = new ConexaoMySql();
    	
    	ProdutoController produtoController = new ProdutoController(conn);
    	

    	Produto produto = new Produto("COCA-COLA", 8.00);
    	
    	produtoController.cadastrarProduto(produto);
    	
    	produtoController.listarProdutos();
    	
    	
    }

}
