package principal;

import java.util.Date;

import dominio.Categoria;
import dominio.Produto;
import dominio.SubCategoria;
import servico.CategoriaServico;
import servico.ProdutoServico;
import servico.SubCategoriaServico;

public class Teste {
	
	
	
	// m�todos Categoria
	public void listarCategoria() {
		CategoriaServico catservico = new CategoriaServico("exemplo-jpa");
		for(Categoria item: catservico.listar()) {
			System.out.println(item);
		}
		catservico.dispose();
	}
	
	public void listarCategoriaPorID(int id) {
		CategoriaServico catservico = new CategoriaServico("exemplo-jpa");
		System.out.println(catservico.obter(id));
		catservico.dispose();
	}
	
	public void listarSubCategoria() {
		
		SubCategoriaServico subCatservico = new SubCategoriaServico("exemplo-jpa");
		for(SubCategoria item: subCatservico.listar()) {
			System.out.println(item);
		}
		subCatservico.dispose();		
	}
	
	public void listarProduto() {
		
		ProdutoServico produtoservico = new ProdutoServico("exemplo-jpa");
		for(Produto item: produtoservico.listar()) {
			System.out.println(item);
			
		}
		produtoservico.dispose();

	}
	
	public void inserirCategoria() {
		CategoriaServico catservico = new CategoriaServico("exemplo-jpa");
		catservico.inserir(new Categoria(null,"teste", new Date()));
		
		catservico.dispose();

	}
	
	public void alterarCategoria() {
		
		CategoriaServico catservico = new CategoriaServico("exemplo-jpa");
		catservico.alterar(new Categoria(22, "Teste ", new Date()));

	}
	
	public void deletarCategoriaPorInstancia(int id) {
		
		CategoriaServico catservico = new CategoriaServico("exemplo-jpa");
		Categoria cat = catservico.obter(id);
		catservico.excluir(cat);
	
	}
	
	
	public void deletarCategoriaPorID(int id) {

		CategoriaServico catservico = new CategoriaServico("exemplo-jpa");
		catservico.excluir(id);
		catservico.dispose();
			
		
	}

}






//CategoriaServico catservico = new CategoriaServico("exemplo-jpa");
//for(Categoria item: catservico.listar()) {
//		System.out.println(item);
//}
//catservico.dispose();

	
//	SubCategoriaServico subCatservico = new SubCategoriaServico("exemplo-jpa");
//	for(SubCategoria item: subCatservico.listar()) {
//		System.out.println(item);
//		
//	}
//	subCatservico.dispose();
	
	
	
//	ProdutoServico produtoservico = new ProdutoServico("exemplo-jpa");
//	for(Produto item: produtoservico.listar()) {
//		System.out.println(item);
//		
//	}
//	produtoservico.dispose();
