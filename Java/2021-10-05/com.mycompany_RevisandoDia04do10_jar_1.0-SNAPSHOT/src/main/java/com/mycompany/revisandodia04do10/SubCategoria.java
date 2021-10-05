
package com.mycompany.revisandodia04do10;
import java.util.*;
public class SubCategoria extends CamposComuns implements IProjecaoDeDados{
    
    private int subCategoriaID;
    private int categoriaID;
    private Categoria categoria;
    private Produto produtos [];
    private Scanner sc;
    
    
    
    // métodos \\
    
    public Produto[] getProdutos(){
        return this.produtos;
    }
    
    public int getSubCategoriaID(){
        return subCategoriaID;
    }
    
    public void setSubCategoriaID (int subCategoriaID){
        this.subCategoriaID = subCategoriaID;
    }
    
    public int getCategoriaID(){
        return categoriaID;
    }
    
    public Categoria getCategoria(){
        return categoria;
    }
    
    public void setCategoria(Categoria categoria){
         this.categoria = categoria;
    }
    
    public SubCategoria(Categoria novaCategoria){
        this.sc = new Scanner(System.in);
        this.categoria = novaCategoria;
        this.categoriaID = categoria.getCategoriaID();
        this.produtos = new Produto[3];
        }
    
    public boolean AdicionarProduto(Produto produto){
        for (int i = 0; i < 3; i++){
            if (this.produtos[i] == null){
                this.produtos[i] = produto;
                return true;
            }
        }
        
        return false;
    }
    
        public void Imprimir(){
            
            
        System.out.println("SubCategoria ID: " + this.subCategoriaID );
        System.out.println("Categoria ID: " + this.categoriaID );
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Data de Inclusão: " + this.dataInsert);
        
        System.out.println("Imprimir Produtos:");
        for (int i = 0; i < 3; i++){
             this.produtos[i].Imprimir();
        }
        
    }
        
        
        
        
        
        
        
        public void ImprimirProduto(){
            
            
        System.out.println("SubCategoria ID: " + this.subCategoriaID );
        System.out.println("Categoria ID: " + this.categoriaID );
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Data de Inclusão: " + this.dataInsert);
        
        System.out.println("Imprimir Produtos:");
        for (int i = 0; i < 3; i++){
             this.produtos[i].Imprimir();
        }
        
    }
        
}
