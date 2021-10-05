package com.mycompany.revisandodia04do10;

// extends significa que herdamos de tal lugar, um exemplo:
// filho extendes mãe   ---> O filho herda algo da mãe.
public abstract class CamposComuns extends CamposDeData {
    
    // Atributos:
    
    // A privacidade desse atributo é protected pois classes filhas poderão utilizar.
    protected String descricao;
    
    // Métodos:
    
    
    // Método get é usado para pegar um valor, pegueDescricao, pegue tal coisa.
    public String getDescricao(){
        return descricao;
    }
    
    
    // Método set é usado para atribuir, alterar, colocar um novo valor 
    //Por isso ele é void, pois somos nós que retornamos o valor para ele.
    public void setDescricao (String descricao){
        this.descricao = descricao;
    }
    
    
    
    
    
}
