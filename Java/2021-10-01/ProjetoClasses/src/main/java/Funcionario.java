import java.util.*;


public class Funcionario extends CamposDeData {
    
    private int funcionarioID;
    private long chaveID;   
    private String nome;
    private String sobreNome;
    private String dataAdmissao;
    private String sexo;
    private Date dataNascimento;
    private String email;
    private String ctps;
    private int ctpsnum;
    private int ctpsserie;
    private int paisID;
    private Pais pais;
    
    // MÉTODOS:
    
    public Funcionario(){
        //this.pais = pais;
    }
    
    public int getFuncionarioID() {
        return funcionarioID;
    }
  
    public void setFuncionarioID(int funcionarioID) {
        this.funcionarioID = funcionarioID;
    }

    public long getChaveID() {
        return chaveID;
    }

    public void setChaveID(long chaveID) {
        this.chaveID = chaveID;
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

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
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

    public int getCtpsnum() {
        return ctpsnum;
    }

    public void setCtpsnum(int ctpsnum) {
        this.ctpsnum = ctpsnum;
    }

    public int getCtpsserie() {
        return ctpsserie;
    }

    public void setCtpsserie(int ctpsserie) {
        this.ctpsserie = ctpsserie;
    }

    public int getPaisID() {
        return paisID;
    }

    public void setPaisID(int paisID) {
        this.paisID = paisID;
    }
    
}
