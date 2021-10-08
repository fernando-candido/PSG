package com.mycompany.atividadearraylist;

import com.mycompany.atividadearraylist.FakeDB.EstoqueFakeDB;
import java.util.*;

public class Imprimir{

        public void imprimirCategoria(){
            EstoqueFakeDB.getCategorias().stream()
                    .filter(lambda -> (lambda.getCategoriaID() > 0) && (lambda.getCategoriaID() <= 3))
                    .forEach(cat -> {
                System.out.printf("CategoriaID: %d\t\n",cat.getCategoriaID());
                System.out.printf("Descrição: %d\t\n", cat.getDescricao());
                System.out.printf("Data de Cadastro: \t\n",cat.getDataInsert());
            });   
        }
        
        
        public void imprimirSubCategoria(int sub){
            EstoqueFakeDB.getSubCategorias().stream()
                    .filter(lambda -> lambda.getCategoriaID() == sub)
                    .forEach(s -> {
                        System.out.printf("ID da SubCategoria: %d\t\n",s.getSubCategoriaID());
                        System.out.printf("ID da Categoria: %d\t\n",s.getCategoriaID());
                        System.err.printf("Descrição: %s\t\n",s.getDescricao());
                    });
        }
        
        public void imprimirProduto(int pro){
            EstoqueFakeDB.getProdutos().stream()
                    .filter(lambda -> lambda.getSubCategoriaID() == pro)
                    .forEach( p -> {
                        System.err.printf("ID do Produto: %d\t\n", p.getProdutoID());
                        System.err.printf("Nome do produto: %s\t\n", p.getDescricao());
                
            });
        
        
        
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