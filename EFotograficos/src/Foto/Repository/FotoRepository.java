package Foto.Repository;
import Model.Model;
public interface FotoRepository {
	
	public void adicionarProduto(Model produto);
	public void listarProduto();
	public void atualizarProduto(Model produto);
	public void deletarProduto(int numero);


	
	
}
