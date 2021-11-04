using System;
using ConsoleApp.Dao;
using ConsoleApp.Poco;
using ConsoleApp.FakeDB;
using ConsoleApp.Service;


namespace ConsoleApp.Service
{
    public class CategoriaService 
    {
    private CategoriaDao dao;
    int op = Convert.ToInt32(Console.ReadLine());
    
    public CategoriaService(){
        this.dao = new CategoriaDao();
    }
    
    public void exibirMenu(){
        bool sair = false;
        do {
            
            int op = Convert.ToInt32(Console.ReadLine());
            switch(op){
                case 1:
                    this.printMenuInserir();
                    
                     break;
                     
                case 2:
                    this.printMenuListar();
                     break;
                     
                case 3:
                    this.printMenuDetalhar();
                    
                     break;
                     
                case 4:
                    this.printMenuAlterar();
                    
                     break;
                     
                case 5:
                    this.printMenuDeletar();
                    break;
                    
                case 6:
                     sair = true;
                     break;
                     
                default:
                    Console.WriteLine("Opção não dísponivel. Tente novamente.");
            }
            
        }
        
        while (sair != true);
    }
        private int printMenu(){
            Console.WriteLine("Menu Categoria - Crud\n");
            Console.WriteLine("**************************\n");
            Console.WriteLine("1 - Inserir\n");
            Console.WriteLine("2 - Listar\n");
            Console.WriteLine("3 - Detalhar\n");
            Console.WriteLine("4 - Alterar\n");
            Console.WriteLine("5 - Deletar\n");
            Console.WriteLine("6 - Sair\n");
            Console.WriteLine("**************************\n");
            Console.WriteLine("Digite uma opção: \n"); 
            int op = Convert.ToInt32(Console.ReadLine());
            return this.op;
        }
        
        private void printMenuInserir(){
            Console.WriteLine("Digite o ID da Categoria: ");
            int cat = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Digite a Descrição da categoria: ");
            String desc = Console.ReadLine();
            
            CategoriaPoco poco = new CategoriaPoco();
            poco.setCategoriaID(id);
            poco.setDescricao(desc);
            this.dao.create(poco);
            
            if (this.dao.read(id) != null){
                            
                Console.WriteLine("Categoria adicionada.");
                Console.WriteLine("******************************\n");
                
            }
            
            else{
                
                Console.WriteLine("Erro ao adicionar Categoria.");
            }


        }
        private void printMenuListar(){
            for (CategoriaPoco item : this.dao.readAll()) {
            Console.WriteLine("*****Menu Listar********\n");
            Console.WriteLine("Categoria ID: %d \n", item.getCategoriaID());
            Console.WriteLine("Listar: %s \n", item.getDescricao());
            Console.WriteLine("**************************\n");
            }
            
            //this.dao.readAll().stream().forEach(-> {});
        
        }
        
        
        private void printMenuDetalhar(){
            Console.WriteLine("*****Menu Detalhar********\n");
            Console.WriteLine("Digite qual categoria: \n");
            int op = Convert.ToInt32(Console.ReadLine());
            CategoriaPoco item = this.dao.read(op);
            if (item == null){
                Console.WriteLine("Categoria não existe. Tente novamente.");
                
            }
            else{
            Console.WriteLine("Categoria ID: %d \n", item.getCategoriaID());
            Console.WriteLine("Listar: %s \n", item.getDescricao());
            Console.WriteLine("**************************\n");     
            
            }
            
        }
        
        

        
        private void printMenuAlterar(){
            
            Console.WriteLine("*****Menu Alterar********\n");
            Console.WriteLine("Digite qual categoria: \n");
            int op = Convert.ToInt32(Console.ReadLine());
            CategoriaPoco item = this.dao.read(op);
            if (item == null){
                Console.WriteLine("Categoria não existe. Tente novamente.");
                
            }
            else{
            Console.WriteLine("Categoria ID: %d \n", item.getCategoriaID());
            Console.WriteLine("Listar: %s \n", item.getDescricao());
            Console.WriteLine("Digite a descrição da nova Categoria: \n");   
            String desc = Console.ReadLine();
            item.setDescricao(desc);
            Console.WriteLine("Categoria alterada com sucesso.");
            Console.WriteLine("*****************");
            
            }

        }
        
        
        private void printMenuDeletar(){
            
            Console.WriteLine("*****Menu Deletar********\n");
            Console.WriteLine("Digite qual categoria: \n");
            int op = Convert.ToInt32(Console.ReadLine());
            CategoriaPoco item = this.dao.read(op);
            if (item == null){
                Console.WriteLine("Categoria não existe. Tente novamente.");
                
            }
            else{
            Console.WriteLine("Categoria ID: %d \n", item.getCategoriaID());
            Console.WriteLine("Listar: %s \n", item.getDescricao());
            Console.WriteLine("Digite a descrição da nova Categoria: \n");   
            this.dao.delete(item.getCategoriaID());
            CategoriaPoco itemDeletado = this.dao.read(op);
            if (itemDeletado == null){
                Console.WriteLine("Categoria excluida com sucesso.");
            }
            Console.WriteLine("*****************");
            }
        
        }


    }
}
