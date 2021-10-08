package com.mycompany.atividadearraylist.Pojo;

import java.util.*;

public class Imprimir{
    
        private Scanner op;   
        
        public void imprimirCategoria(ArrayList <CategoriaPojo> categorias){
            
            for(CategoriaPojo categoria : categorias){
                
                System.out.println(categoria.getCategoriaID());
                System.out.println(categoria.getDescricao());
                System.out.println(categoria.getDataInsert());
            
            }
        }
        public void imprimirSubCategoria(ArrayList <SubCategoriaPojo> subcategoria){
 
            
        }
            
          
        
       
    }                        












/*

        this.op = new Scanner (System.in);
        
        System.out.println("Qual categoria deseja imprimir?");
        
        int opcao = this.op.nextInt();
        if (op.equals(1)){
            System.out.println("Imprimir Categoria");
        }
        else{
            System.out.println("Fim do programa");
        }

*/