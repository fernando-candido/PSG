package principal;
import dominio.Categoria;
import repositorio.CategoriaRepositorio;

public class Programa {

	public static void main(String[] args) {
		
		CategoriaRepositorio repo = new CategoriaRepositorio("exemplo-jpa");
		
		for (Categoria cat : repo.readAll()) {
			System.out.println(cat);
		}
		

	}

}
