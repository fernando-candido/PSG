package Service;
import Dao.*;
import Pojo.*;
import java.util.*;


public class FuncionarioService {
    
    private FuncionarioDao dao;
    private Scanner sc;


    public FuncionarioService(){
        this.sc = new Scanner(System.in);
        this.dao = new FuncionarioDao();
    }
    
        public void exibirMenu(){
        boolean sair = false;
        do {
            
            int op = this.printMenu();
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
                    System.out.println("Opção não dísponivel. Tente novamente.");
            }
            
        }
        
        while (sair != true);
    }
        private int printMenu(){
            System.out.printf("Menu Categoria - Crud\n");
            System.out.printf("**************************\n");
            System.out.printf("1 - Inserir\n");
            System.out.printf("2 - Listar\n");
            System.out.printf("3 - Detalhar\n");
            System.out.printf("4 - Alterar\n");
            System.out.printf("5 - Deletar\n");
            System.out.printf("6 - Sair\n");
            System.out.printf("**************************\n");
            System.out.printf("Digite uma opção: \n"); 
            
            return this.sc.nextInt();
        }
        
        private void printMenuInserir(){
            System.out.println("Digite o ID do Funcionario: ");
            int id = this.sc.nextInt();
            System.out.println("Digite a Nome do funcionario: ");
            String name = this.sc.next();
            
            FuncionarioPojo pojo = new FuncionarioPojo();
            pojo.setFuncionarioID(id);
            pojo.setNome(name);
            this.dao.create(pojo);
            
            if (this.dao.read(id) != null){
                            
                System.out.println("Funcionario adicionada.");
                System.out.println("******************************\n");
                
            }
            
            else{
                
                System.out.println("Erro ao adicionar Funcionario.");
            }


        }
        private void printMenuListar(){
            for (FuncionarioPojo item : this.dao.readAll()) {
            System.out.printf("*****Menu Listar********\n");
            System.out.printf("Funcionario ID: %d \n", item.getFuncionarioID());
            System.out.printf("Nome: %s \n", item.getNome());
            System.out.printf("**************************\n");
            }
            
            //this.dao.readAll().stream().forEach(-> {});
        
        }
        
        
        private void printMenuDetalhar(){
            System.out.printf("*****Menu Detalhar********\n");
            System.out.println("Digite qual categoria: \n");
            int op = this.sc.nextInt();
            FuncionarioPojo item = this.dao.read(op);
            if (item == null){
                System.out.println("Categoria não existe. Tente novamente.");
                
            }
            else{
            System.out.printf("Categoria ID: %d \n", item.getFuncionarioID());
            System.out.printf("Nome: %s \n", item.getNome());
            System.out.printf("**************************\n");     
            
            }
            
        }
        
        

        
        private void printMenuAlterar(){
            
            System.out.printf("*****Menu Alterar********\n");
            System.out.println("Digite qual categoria: \n");
            int op = this.sc.nextInt();
            FuncionarioPojo item = this.dao.read(op);
            if (item == null){
                System.out.println("Funcionario não existe. Tente novamente.");
                
            }
            else{  
            System.out.printf("Digite o nome do novo Funcionario: \n");      
            String nome = this.sc.next();
            item.setNome(nome); 
            System.out.printf("Funcionario ID: %d \n", item.getFuncionarioID());
            System.out.printf("Nome: %s \n", item.getNome()); 
            System.out.println("Funcionario alterado com sucesso.");
            System.out.println("*****************");

            }

        }
        
        
        private void printMenuDeletar(){
            
            System.out.printf("*****Menu Deletar********\n");
            System.out.println("Digite qual funcionario: \n");
            int op = this.sc.nextInt();
            FuncionarioPojo item = this.dao.read(op);
            if (item == null){
                System.out.println("Funcionario não existe. Tente novamente.");
                
            }
            else{
            System.out.printf("Funcionario ID: %d \n", item.getFuncionarioID());
            System.out.printf("Nome: %s \n", item.getNome());
            System.out.printf("Digite o nome do novo Funcionario(a): \n");   
            this.dao.delete(item.getFuncionarioID());
            FuncionarioPojo itemDeletado = this.dao.read(op);
            if (itemDeletado == null){
                System.out.println("Funcionario excluido com sucesso.");
            }
            System.out.println("*****************");
            }
        
        }

    
    
    
}
