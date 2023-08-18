package Foto.Controller;

import java.util.ArrayList;

import Foto.Repository.FotoRepository;
import Model.Model;

public class Controller implements FotoRepository{
	
	private ArrayList<Model> listaModel = new ArrayList <Model>();

	@Override
	public void adicionarProduto(Model produto) {  
		int id =0; 
		for (Model item: listaModel) {
			id=item.getCod();
			
			
		}
		
		produto.setCod(id+1);
		listaModel.add(produto);
	}

	@Override
	public void listarProduto() {
		for (var prod: listaModel) {
			prod.visualizar();
			
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarProduto(Model produtoAtualizado) {
		
		int codigo = produtoAtualizado.getCod();
		Model produtoAtual = buscarNaCollection(codigo);
		if (produtoAtual != null) {
		int index = listaModel.indexOf(produtoAtual);
		listaModel.set(index, produtoAtualizado);
		System.out.println("\n O Produto " + codigo + "Atualizado com sucesso");
		}
		
		else {
		 
			System.out.println("\n O Produto" + codigo + "Não foi encontrado");
			
		}
		
		// TODO Auto-generated method stub
		
	}

	public Model buscarNaCollection(int codigo) {
		
		for (var produto : listaModel) {
			if (produto.getCod() == codigo) {
				return produto;
				
			}
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletarProduto(int numero) {
		
		var produto = buscarNaCollection(numero);
		int cod = 0;
		if (produto != null) {
			if (listaModel.remove(produto) == true)
				System.out.println("\nProduto: " +numero+ "Deletado");
		}
		else
			System.out.println("\nProduto" +numero+ "Não encontrado");
		
				
		}
		// TODO Auto-generated method stub
		
	}
	

