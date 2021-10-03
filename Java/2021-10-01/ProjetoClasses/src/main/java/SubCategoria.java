public class SubCategoria extends CamposComuns {
    
        private int subCategoriaID;
        private int categoriaID;
        private Categoria categoria;
     
        
        public void subCategoriaID(Categoria categoria){
            this.categoria = categoria;
            
        
        }
    public int getSubCategoriaID() {
        return subCategoriaID;
    }
    public void setSubCategoriaID(int subCategoriaID) {
        this.subCategoriaID = subCategoriaID;
    }
       }
