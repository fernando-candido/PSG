package com.mycompany.revisandodia04do10;
import java.util.*;
public class Categoria extends CamposComuns implements IProjecaoDeDados{
    
    // private significa que só a classe pode ver o atributo.
    private int categoriaID;
    private SubCategoria subCategorias[];  // declarando uma variavel vetor
    
    private Scanner sc;
    
    
    public SubCategoria[] getSubCateogiras(){
        return this.subCategorias;
    }
    
    public int getCategoriaID(){
        return categoriaID;
        }
    
    // nesse set, estamos dizendo que Categoria ID vai receber um inteiro com o nome chamado categoriaID
    public void setCategoriaID(int categoriaID){
        this.categoriaID = categoriaID;
    }
    
    // método construtor ( usado para criar novas instâncias das classes)
    public Categoria(){
        this.subCategorias = new SubCategoria[3];
        this.sc = new Scanner(System.in);
    }
    
    public boolean AdicionarSubCategoria(SubCategoria subcat){
        for(int i = 0; i < 3; i++ ){
            if(this.subCategorias[i] == null){
               this.subCategorias[i] = subcat;
               return true;
            }
        }
        return false;
    }
    
    public void Imprimir(){
        System.out.println("CategoriaID: " + this.categoriaID );
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Data de Inclusão: " + this.dataInsert);
        
        for (int i = 0; i < 3; i++){
            System.out.println("Imprimir SubCategorias:");
            this.subCategorias[i].Imprimir();
        }
    }
    
        public void ImprimirSubCategoria(){
        System.out.println("CategoriaID: " + this.categoriaID );
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Data de Inclusão: " + this.dataInsert);
        
        
        System.out.println("Deseja imprimir tudo? [ S / N ]");
        String op = this.sc.nextLine();
        
        if (op.equals("s")) {
            for (int i = 0; i < 3; i++){
                System.out.println("Imprimir SubCategorias:");
                this.subCategorias[i].Imprimir();
            }
        }
        
        
        else{
            System.out.println("Fim do programa.");
        }
    }
  
}

