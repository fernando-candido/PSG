using System;
using System.Collections.Generic;
using System.Linq;

namespace ConsoleApp
{
    public class EstoqueLambda
    {
        public EstoqueLambda()
        {
            var c = EstoqueFakeDB.Categorias;
            var s = EstoqueFakeDB.SubCategorias;
            var p = EstoqueFakeDB.Produtos;
        }

        public void TestarExibicao()
        {
            this.ExibirCategoria();
        }

        private void ExibirCategoria() 
        {
            Console.WriteLine("AS Seguintes Categorias estão disponíveis: ");
            Console.WriteLine("===========================================");

            EstoqueFakeDB.Categorias
                .Where(c => (c.CategoriaID > 0) && (c.CategoriaID <= 3))
                .ToList()
                .ForEach(cat => {
                    Console.WriteLine("Categoria ID: {0}", cat.CategoriaID);
                    Console.WriteLine("Descrição:  {0}", cat.Descricao);
                     Console.WriteLine("===========================================");
                });
        }
    }
}
