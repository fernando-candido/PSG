package com.mycompany.revisandodia04do10;

import java.util.*;


public class Estoque {
    
    // modelo simples
    private Scanner sc;  //= new Scanner(System.in);
    
    private Categoria categorias[];
    
    public Estoque(){
        this.sc = new Scanner (System.in);
    }
     
    public void Testar(){
    
   
        
    Date dataDeInsercao = new Date(System.currentTimeMillis());
        
    Categoria cat = new Categoria();
    cat.setCategoriaID(1);
    cat.setDescricao("Categoria Teste");
    cat.setDataInsert(dataDeInsercao);
    
    SubCategoria subcat = new SubCategoria(cat);
    subcat.setSubCategoriaID(1);
    subcat.setDescricao("SubCategoria Teste");
    subcat.setDataInsert(dataDeInsercao);
    
    Produto pro = new Produto(subcat);
    pro.setProdutoID(1);
    pro.setDescricao("Produto Novo");
    pro.setDataInsert(dataDeInsercao);
    
    Pais pais = new Pais();
    pais.setPaisID(1);
    pais.setAbreviacao("EUA");
    
    Funcionario fun = new Funcionario(pais);
    fun.setFuncionarioID(1);
    fun.setChave(123456789);

    }
  
    // Modelo Intermediário.
    
    public void TestarComVetores(){
        this.inicializarVetorCategorias();
        this.ImprimirTudo(categorias);
        this.sc.next();
        
    }
     
    public void testarcomSelecao(){
        
        boolean enc = false;
        
        this.inicializarVetorCategorias();
        System.out.println("Qual categoria deseja exibir os detalhes?");
        int id = this.sc.nextInt();
        
        for (int i = 0; i < 3; i++){
                if (id == this.categorias[i].getCategoriaID()){
                    this.categorias[i].Imprimir();
                    enc = true;
                }
           
            }
        if (enc == false){
            System.out.println("ID não encontrado.");
        }
        
        this.sc.nextLine();
        
        }
    
    public void testarcomSelecaoPratica(){
        
        boolean enc = false;
        
        this.inicializarVetorCategorias();
        System.out.println("Qual categoria deseja exibir os detalhes?");
        int id = this.sc.nextInt();
        
        for (int i = 0; i < 3; i++){
                if (id == this.categorias[i].getCategoriaID()){
                    this.categorias[i].ImprimirSubCategoria();
                    enc = true;
                }
           
            }
        if (enc == false){
            System.out.println("ID não encontrado.");
        }
        
        this.sc.nextLine();
        
        }
    
    
    /*
        public void Teste(){

            System.out.println("Deseja imprimir tudo? [ S / N ]");
            String op = this.sc.nextLine();
            
            if (op.equals("S")){
                System.out.println("Imprimindo tudo");
                
            }
            
            
        }
    
    */
    
    
    
    
    private void inicializarVetorCategorias(){
        Date dataDeInsercao = new Date(System.currentTimeMillis());
        this.categorias = new Categoria[3];
        categorias[0] = this.criarCategoria(1, "teste 1", dataDeInsercao);
        categorias[1] = this.criarCategoria(2, "teste 2", dataDeInsercao);
        categorias[2] = this.criarCategoria(3, "teste 3", dataDeInsercao);
    
    }
    
    
    
        private Categoria criarCategoria(int id, String descricao, Date dataDeInsert){
        Categoria cat = new Categoria();
        cat.setCategoriaID(id);
        cat.setDescricao(descricao);
        cat.setDataInsert(dataDeInsert);
        for (int i = 0; i < 3; i++) {
            int j = i + 1;
            SubCategoria s = this.criarSubCategoria(cat, j, "Teste SubCategoria " + j, dataDeInsert);
            cat.AdicionarSubCategoria(s);
        }
        return cat;
        
    }
       
        private SubCategoria criarSubCategoria(Categoria cat, int id, String descricao, Date dataDeInsert){
        SubCategoria sub = new SubCategoria(cat);
        sub.setSubCategoriaID(id);
        sub.setDescricao(descricao);
        sub.setDataInsert(dataDeInsert);
        for (int i = 0; i < 3; i++) {
            int j = i + 1;
            Produto p = this.criarProduto(sub, j, "Teste Produto " + j, dataDeInsert);
            sub.AdicionarProduto(p);
        }
        return sub;
    }      
        
        private Produto criarProduto(SubCategoria sub, int id, String descricao, Date dataDeInsert){
            Produto pro = new Produto(sub);
            pro.setProdutoID(id);
            pro.setDescricao(descricao);
            pro.setDataInsert(dataDeInsert);
        return pro;
    }   
           
        private void ImprimirTudo(Categoria categoria[]){
            System.out.println("Imprimindo Categorias:");
            for (int i = 0; i < 3; i++){
                categoria[i].Imprimir();
            }
            
            
        }
    
}

