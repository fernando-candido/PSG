using System;

namespace ConsoleApp
{
    public class ProdutoPoco : CamposComuns
    {

        private int produtoID;
        
        private int categoriaID;
        
        private int subCategoriaID;

        public ProdutoPoco () {}
        public int ProdutoID { get => produtoID; set => produtoID = value; }
        public int CategoriaID { get => categoriaID; set => categoriaID = value; }
        public int SubCategoriaID { get => subCategoriaID; set => subCategoriaID = value; }
    }
}
