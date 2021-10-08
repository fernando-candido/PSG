package com.mycompany.atividadearraylist.Pojo;

import java.util.*;

public class CategoriaPojo extends CamposComuns {
    
    private int categoriaID;
    
    private ArrayList<SubCategoriaPojo> subCategorias;

    public int getCategoriaID(){
        return categoriaID;
    }
 
    public void setCategoriaID(int categoriaID){
        this.categoriaID = categoriaID;
    }
    
    public ArrayList<SubCategoriaPojo> getSubCategorias(){
        return this.subCategorias;
        
    }
    
    public CategoriaPojo(){
        // Inicializar ArrayList;
        this.subCategorias = new ArrayList();
    }

    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    

