package FakeDB;
import java.util.*;
import Pojo.*;

public class RHFakeDB {
    
    private static ArrayList<FuncionarioPojo> funcionarios;
    private static ArrayList<PaisPojo> pais;
    
    public static ArrayList<FuncionarioPojo> getFuncionario(){
        if(funcionarios == null){
            funcionarios = new ArrayList();
            inicializarFuncionario();
        }
        return funcionarios;
    }
    
    
    public static ArrayList<PaisPojo> getPais(){
        if (pais == null){
            pais = new ArrayList();
            inicializarPais();
        }
        return pais;

    }
    
    // Falta o inicializar aqui
    
    private static void inicializarFuncionario(){
        Date dataInsert = new Date(System.currentTimeMillis());
        adicionarFuncionario(1, 123456789, "Fernando", "Candido", 'm', "oficialfcsj@gmail.com", "471541541", dataInsert);
        adicionarFuncionario(2, 424523452, "Luizão", "Jacinto", 'm', "luizao@gmail.com", "32155615", dataInsert);
        adicionarFuncionario(3, 824713958, "Hélio", "Akira", 'm', "helio@gmail.com", "654181298", dataInsert);
        adicionarFuncionario(4, 114785851, "Giovanni", "Gio", 'm', "giovanni@gmail.com", "185151526", dataInsert);
        adicionarFuncionario(5, 415841889, "Alberto", "Albertinho", 'm', "chicobuarque@gmail.com", "98745235", dataInsert);
        adicionarFuncionario(6, 784521369, "Gabriel", "Gab", 'm', "gabriel@gmail.com", "6325148963", dataInsert);
        adicionarFuncionario(7, 523698254, "Wilker", "Wil", 'm', "wilker@gmail.com", "85214365214", dataInsert);
    }
    
    
    private static void inicializarPais(){
        Date dataInsert = new Date(System.currentTimeMillis());
        
        adicionarPais(1, "Brasil", "BR", dataInsert);
        adicionarPais(2, "Estados Unidos", "EUA", dataInsert);
        adicionarPais(3, "Paraguai", "PY", dataInsert);
        adicionarPais(4, "Chile", "CL", dataInsert);
        adicionarPais(5, "Espanha", "ES", dataInsert);
        adicionarPais(6, "Peru", "PE", dataInsert);
        adicionarPais(7, "França", "FR", dataInsert);
    }
    
    
    private static void adicionarFuncionario(int id, long chave, String nome, String sobreNome, char sexo, String email, String ctps, Date dataInsert){
        FuncionarioPojo fc = new FuncionarioPojo();
        fc.setFuncionarioID(id);
        fc.setChave(chave);
        fc.setNome(nome);
        fc.setSobreNome(sobreNome);
        fc.setSexo(sexo);
        fc.setEmail(email);
        fc.setCtps(ctps);
        funcionarios.add(fc);
    }
    
    private static void adicionarPais(int id, String descricao, String abreviacao, Date dataInsert){
        PaisPojo pi = new PaisPojo();
        pi.setPaisID(id);
        pi.setDescricao(descricao);
        pi.setAbreviacao(abreviacao);
        pais.add(pi);
    }
    
    
    
    
}
