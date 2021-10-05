package com.mycompany.revisandodia04do10;
import java.util.*;
public class Produto extends CamposComuns implements IProjecaoDeDados {
    
    private int produtoID;
    private int categoriaID;
    private int subCategoriaID;
    private SubCategoria subCategoria;
    
    
    
    private int getProdutoID(){
       return produtoID;
    }
    
    public void setProdutoID (int produtoID){
        this.produtoID = produtoID;
    }
    
    public int getCategoriaID(){
        return categoriaID;
    }
    
    public int getSubCategoriaID(){
        return subCategoriaID;
    }
    
    public SubCategoria getSubCategoria(){
        return subCategoria;
    }
    
    public void setSubCategoria(SubCategoria subCategoria){
        this.subCategoria = subCategoria;
    }
    
    public Produto(SubCategoria novaSubCategoria){
        this.subCategoria = novaSubCategoria;
        this.subCategoriaID = this.subCategoria.getSubCategoriaID();
        this.categoriaID = this.subCategoria.getCategoria().getCategoriaID();
    }
    
        public void Imprimir(){
            System.out.println("Produto ID: " + this.produtoID );
            System.out.println("SubCategoria ID: " + this.subCategoriaID );
            System.out.println("Categoria ID: " + this.categoriaID );
            System.out.println("Descrição: " + this.descricao);
            System.out.println("Data de Inclusão: " + this.dataInsert);
    }
        
     
}
