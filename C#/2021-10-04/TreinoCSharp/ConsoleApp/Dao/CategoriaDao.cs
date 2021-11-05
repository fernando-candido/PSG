using System;
using ConsoleApp.Service;
using ConsoleApp.Dao;
using ConsoleApp.Poco;
using ConsoleApp.FakeDB;
using System.Collections.Generic;
using System.Linq;


namespace ConsoleApp.Dao
{
    public class CategoriaDao
    {
        public CategoriaDao()
        {

            var c = EstoqueFakeDB.Categorias;
        }


        public List<CategoriaPoco> ReadAll()
        {

            return EstoqueFakeDB.Categorias;

        }


    }


}

/*

        // public void create(CategoriaPoco poco){
        //     EstoqueFakeDB.Categorias.Add(poco);

        // }

        // public CategoriaPoco read(int CategoriaID){
        //     return this.busca(CategoriaID);

        // }

        // public void update(CategoriaPoco poco)

        //     CategoriaPoco busca =  this.search(poco.getCategoriaID());
        //     EstoqueFakeDB.getCategorias().remove(busca);
        //     EstoqueFakeDB.getCategorias().add(poco);


        // }

        // public void delete(int categoriaID){
        //     CategoriaPoco busca = this.search(categoriaID);
        //     EstoqueFakeDB.getCategorias().remove(busca);

        // }   

        // private CategoriaPoco busca(int id){

        //         return EstoqueFakeDB.getCategorias().stream()
        //             .filter(c -> c.getCategoriaID() == id)
        //             .findFirst()
        //             .orElse(null);


        // }





*/













