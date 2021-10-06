package com.mycompany.atividadearraylist.FakeDB;

import com.mycompany.atividadearraylist.Pojo.*;

import java.util.*;



public final class EstoqueFakeDB extends CamposComuns{
    
    private static ArrayList<CategoriaPojo> categorias;
    
    
    public static ArrayList<CategoriaPojo> getCategorias(){
        //Design Pattern Singleton
        if (categorias == null){
            categorias = new ArrayList();
        }
        return categorias;        
    }
     
    private static void inicializarCategorias(){
        Date dataInsert  = new Date(System.currentTimeMillis());
        

    }
    
    private static void inicializarSubCategoria(){
        for (CategoriaPojo item : categorias) {
            Date dataInsert  = new Date(System.currentTimeMillis());
            if(item.getCategoriaID() == 1){
                adicionarSubCategoria(item, 0, descricao, dataInsert);
            }
            
        }
        
    }
    
    private static void adicionarCategoria(int id, String descricao, Date dataInsert){
        CategoriaPojo c = new CategoriaPojo();
        c.setCategoriaID(id);
        c.setDescricao(descricao);
        c.setDataInsert(dataInsert);
        categorias.add(c);
        
    }  
    
      private static void adicionarSubCategoria(CategoriaPojo c, int id, String descricao, Date dataInsert){
        SubCategoriaPojo sc = new SubCategoriaPojo();
        sc.setSubCategoriaID(id);
        sc.setCategoriaID(c.getCategoriaID());
        sc.setDescricao(descricao);
        sc.setDataInsert(dataInsert);
        c.getSubCategorias().add(sc);
 
    }
      
        private static void adicionarProduto(SubCategoriaPojo sc, int id,  String descricao, Date dataInsert){
        ProdutoPojo pro = new ProdutoPojo();
        pro.setProdutoID(id);
        pro.setSubCategoriaID(sc.getSubCategoriaID());
        pro.setCategoriaID(sc.getCategoriaID());
        pro.setSubCategoriaID(id);
        pro.setDescricao(descricao);
        pro.setDataInsert(dataInsert);
        pro.getProdutos().add(pro);
 
    }
      
}
