package com.mycompany.atividadearraylist;
import com.mycompany.atividadearraylist.FakeDB.EstoqueFakeDB;
import com.mycompany.atividadearraylist.Pojo.Imprimir;
import com.mycompany.atividadearraylist.Pojo.ProdutoPojo;
import java.util.*;

public class Principal {
    
    public static void main(String[] args) {

        EstoqueFakeDB estoque = new EstoqueFakeDB();
        Imprimir imprimir = new Imprimir();
        imprimir.imprimirCategoria(EstoqueFakeDB.getCategorias());   
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
       

