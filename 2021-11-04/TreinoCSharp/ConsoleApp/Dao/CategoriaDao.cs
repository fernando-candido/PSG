using System;
using ConsoleApp.Service;
using ConsoleApp.Dao;
using ConsoleApp.Poco;
using ConsoleApp.FakeDB;


namespace ConsoleApp.Dao
{
    public class CategoriaDao
    {

       int c = EstoqueFakeDB.getCategorias();
   
    }
    
    // CRUD
    
    public void create(CategoriaPoco poco){
        EstoqueFakeDB.getCategorias().add(poco);

    }
    
    public CategoriaPoco read(int categoriaID){
        return this.search(categoriaID);
        
    }
    
    public List<CategoriaPoco> readAll(){
        
        return EstoqueFakeDB.getCategorias();
        
    }
    
    public void update(CategoriaPoco poco){
        CategoriaPoco busca =  this.search(poco.getCategoriaID());
        EstoqueFakeDB.getCategorias().remove(busca);
        EstoqueFakeDB.getCategorias().add(poco);
        
        
    }
    
    public void delete(int categoriaID){
        CategoriaPoco busca = this.search(categoriaID);
        EstoqueFakeDB.getCategorias().remove(busca);
        
    }   
    
    private CategoriaPoco busca(int id){
        
            return EstoqueFakeDB.getCategorias().stream()
                .filter(c -> c.getCategoriaID() == id)
                .findFirst()
                .orElse(null);
        
    
    }


    }

}




