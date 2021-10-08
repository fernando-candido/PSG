package com.mycompany.atividadearraylist;
import com.mycompany.atividadearraylist.FakeDB.EstoqueFakeDB;
import com.mycompany.atividadearraylist.Pojo.*;

import java.util.*;

public class Principal {
    
    public static void main(String[] args) {

        
        Imprimir imprimir = new Imprimir();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("***************************************");
        System.err.println("Qual SubCategoria deseja ver?");
        int n = scan.nextInt();
        System.out.println("***************************************");
        
        imprimir.imprimirSubCategoria(n);
        System.out.println("***************************************");
        System.err.println("Qual Produto deseja ver?");
        n = scan.nextInt();
        System.out.println("***************************************");
        imprimir.imprimirProduto(n);
        
    }
    
}











       

        
        
        //imprimir.Imprimir();
       /*
        int i;
        i = 0;
        for(int i = 0; i <  ;i++){  //enquanto i for menor, não maior
            System.out.println(ProdutoPojo.get(i));  
        }
        
        
                
        Imprimir imprimir = new Imprimir();
        
        imprimir.Imprimir();
        
        
        
        */
       

