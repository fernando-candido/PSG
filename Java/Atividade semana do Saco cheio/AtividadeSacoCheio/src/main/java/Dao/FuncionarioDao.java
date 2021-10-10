package Dao;
import FakeDB.*;
import Pojo.*;
import java.util.*;

public class FuncionarioDao {
    
    
    public FuncionarioDao(){
        RHFakeDB.getFuncionario();
        
    }
    
    
    //CRUD
    
    
    public void create(FuncionarioPojo pojo){
         RHFakeDB.getFuncionario().add(pojo);
    }
    
    public FuncionarioPojo read(int funcionarioID){
        
        return this.search(funcionarioID);
        
    }
    
    public ArrayList<FuncionarioPojo>readAll(){
        return RHFakeDB.getFuncionario();
    }

    public void update(FuncionarioPojo pojo){
        FuncionarioPojo busca = this.search(pojo.getFuncionarioID());
        RHFakeDB.getFuncionario().remove(busca);
        RHFakeDB.getFuncionario().add(pojo);   
    }
    
    public void delete (int funcionarioID){
        FuncionarioPojo busca = this.search(funcionarioID);
        RHFakeDB.getFuncionario().remove(busca);
    }
    
    private FuncionarioPojo search(int id){
        return RHFakeDB.getFuncionario().stream()
        .filter(f -> f.getFuncionarioID() == id).findFirst().orElse(null);
    }
        
}
