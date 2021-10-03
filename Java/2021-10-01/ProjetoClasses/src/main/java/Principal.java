public class Principal{
    
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.setDescricao("teclado");
        
        System.out.println(p1.getDescricao());
        Funcionario f1 = new Funcionario();
        f1.setNome("Fernando");
        System.out.println(f1.getNome());
        
        Funcionario f2 = new Funcionario();
        f2.setNome("Giovanni");
        System.out.println(f2.getNome());
        
        Funcionario f3 = new Funcionario();
        f3.setSexo("Masculino");
        
        System.out.println(f3.getSexo());
        
    }
    
}
