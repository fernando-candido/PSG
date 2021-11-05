using System;
using ConsoleApp.Service;

namespace ConsoleApp.Principal
{
    class Program
    {
        static void Main(string[] args)
        {

            // EstoqueLambda estoque = new EstoqueLambda();
            // estoque.TestarExibicao();
            // Console.ReadLine();

            CategoriaService categoria = new CategoriaService();
            categoria.exibirMenu();


        }
    }
}
