package com.mycompany.revisandodia04do10;

public class Pais {
    
    private int paisID;
    private String abreviacao;
    
    public int getPaisID(){
        return paisID;
    }
    
    public String getAbreviacao(){
        return abreviacao;
    }
    
    public void setAbreviacao (String abreviacao){
        this.abreviacao = abreviacao;
    }
    
    public void setPaisID(int paisID){
        this.paisID = paisID;
    }
    
    public Pais() {}
    
}
