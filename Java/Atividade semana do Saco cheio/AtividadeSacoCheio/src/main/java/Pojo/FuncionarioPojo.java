package Pojo;
import java.util.*;

    
    

public class FuncionarioPojo extends CamposDeData {

    private int funcionarioID;

    private long chave;

    private String nome;

    private String sobreNome;

    private Date dataAdmissao;

    private char sexo;

    private Date dataNascimento;

    private String email;

    private String ctps;

    private long ctpsNum;

    private int ctpsSerie;

    private int paisID;

    private PaisPojo pais;


    public int getFuncionarioID() {
        return funcionarioID;
    }


    public void setFuncionarioID(int funcionarioID) {
        this.funcionarioID = funcionarioID;
    }

    public long getChave() {
        return chave;
    }


    public void setChave(long chave) {
        this.chave = chave;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }


    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }


    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }


    public char getSexo() {
        return sexo;
    }


    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public Date getDataNascimento() {
        return dataNascimento;
    }


    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getCtps() {
        return ctps;
    }


    public void setCtps(String ctps) {
        this.ctps = ctps;
    }


    public long getCtpsNum() {
        return ctpsNum;
    }


    public void setCtpsNum(long ctpsNum) {
        this.ctpsNum = ctpsNum;
    }


    public int getCtpsSerie() {
        return ctpsSerie;
    }


    public void setCtpsSerie(int ctpsSerie) {
        this.ctpsSerie = ctpsSerie;
    }


    public int getPaisID() {
        return paisID;
    }


    public void setPaisID(int paisID) {
        this.paisID = paisID;
    }

    public PaisPojo getPais() {
        return pais;
    }


    public void setPais(PaisPojo pais) {
        this.pais = pais;
    }

    /*
    public FuncionarioPojo(PaisPojo meuPais){
        this.pais = meuPais;
        this.paisID = this.pais.getPaisID();
    }
    */
    
    public void FuncionarioPojo(){};
    
}
    

