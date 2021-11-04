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
            this.ExibirCategorias();
            Console.WriteLine("Selecione a Categoria (ID) para exibir as SubCategorias disponíveis: ");
            int catid = Convert.ToInt32(Console.ReadLine());
            if ((catid != 1) && (catid != 2) && (catid != 3))
            {
                Console.WriteLine("A Categoria selecionada não está disponível");


            }

            else
            {
                this.ExibirSubCategorias(catid);
                Console.WriteLine("Selecione a SubCategoria (ID) para exibir os produtos disponíveis");
                int subcatid = Convert.ToInt32(Console.ReadLine());
                this.ExibirProdutos(subcatid);
            }


        }


        private void ExibirCategorias()
        {
            Console.WriteLine("AS Seguintes Categorias estão disponíveis: ");
            Console.WriteLine("===========================================");


            EstoqueFakeDB.Categorias
                .Where(c => (c.CategoriaID > 0) && (c.CategoriaID <= 3))
                .ToList()
                .ForEach(cat =>
                {
                    Console.WriteLine("Categoria ID: {0}", cat.CategoriaID);
                    Console.WriteLine("Descrição:  {0}", cat.Descricao);
                    Console.WriteLine("===========================================");
                });
        }

        private void ExibirSubCategorias(int catid)
        {
            Console.WriteLine("AS Seguintes SubCategorias estão disponíveis: ");
            Console.WriteLine("===========================================");


            EstoqueFakeDB.SubCategorias
                .Where(s => (s.CategoriaID == catid))
                .ToList()
                .ForEach(sub =>
                {
                    Console.WriteLine("SubCategoria: {0}", sub.SubCategoriaID);
                    Console.WriteLine("Categoia:  {0}", sub.CategoriaID);
                    Console.WriteLine("Descrição:  {0}", sub.Descricao);
                    Console.WriteLine("===========================================");

                });
        }



        private void ExibirProdutos(int subcatid)
        {
            Console.WriteLine("Os Seguintes Produtos estão disponíveis: ");
            Console.WriteLine("===========================================");


            EstoqueFakeDB.Produtos
                .Where(p => (p.SubCategoriaID == subcatid))
                .ToList()
                .ForEach(pro =>
                {
                    Console.WriteLine("Produto ID: {0}", pro.ProdutoID);
                    Console.WriteLine("SubCategoria ID: {0}", pro.SubCategoriaID);
                    Console.WriteLine("Categoia:  {0}", pro.CategoriaID);
                    Console.WriteLine("Descrição:  {0}", pro.Descricao);
                    Console.WriteLine("===========================================");

                });
        }



    }
}
