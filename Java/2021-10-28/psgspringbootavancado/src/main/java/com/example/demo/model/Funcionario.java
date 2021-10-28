package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Funcionario {
	
	@Id
	@Column(name = "FuncionarioID")
    private Integer funcionarioID;
	
	@Column(name = "Chave")
    private long chave; 
	
	@Column(name = "Nome")
    private String nome;
	
	@Column(name = "SobreNome")
    private String sobreNome;
	
	@Column(name = "Admissao")
	@Temporal(value = TemporalType.DATE)
    private Date dataAdmissao;
    
	@Column(name = "Sexo")
	private String sexo;
	
	@Column(name = "Nascimento")
	@Temporal(value = TemporalType.DATE)
    private Date nascimento;
    
	@Column(name = "Email")
    private String email;
    
	@Column(name = "Ctps")
    private String ctps;
	
	@Column(name = "PaisID")
	private int paisID;
	
	@Column(name = "CtpsNum")
    private Integer ctpsnum;
    
	@Column(name = "CtpsSerie")
    private Integer ctpsserie;
	
	@Column(name = "Inclusao", nullable = true)
	@Temporal(value = TemporalType.DATE)
    private Date dataDeInsercao;

	public Funcionario () {}
	

	public Funcionario(Integer funcionarioID, long chave, String nome, String sobreNome, Date dataAdmissao, String sexo,
			Date nascimento, String email, String ctps, int paisID, Integer ctpsnum, Integer ctpsserie,
			Date dataDeInsercao) {
		super();
		this.funcionarioID = funcionarioID;
		this.chave = chave;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dataAdmissao = dataAdmissao;
		this.sexo = sexo;
		this.nascimento = nascimento;
		this.email = email;
		this.ctps = ctps;
		this.paisID = paisID;
		this.ctpsnum = ctpsnum;
		this.ctpsserie = ctpsserie;
		this.dataDeInsercao = dataDeInsercao;
	}



	public Integer getFuncionarioID() {
		return funcionarioID;
	}



	public void setFuncionarioID(Integer funcionarioID) {
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



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public Date getNascimento() {
		return nascimento;
	}



	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
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



	public int getPaisID() {
		return paisID;
	}



	public void setPaisID(int paisID) {
		this.paisID = paisID;
	}



	public Integer getCtpsnum() {
		return ctpsnum;
	}



	public void setCtpsnum(Integer ctpsnum) {
		this.ctpsnum = ctpsnum;
	}



	public Integer getCtpsserie() {
		return ctpsserie;
	}



	public void setCtpsserie(Integer ctpsserie) {
		this.ctpsserie = ctpsserie;
	}



	public Date getDataDeInsercao() {
		return dataDeInsercao;
	}



	public void setDataDeInsercao(Date dataDeInsercao) {
		this.dataDeInsercao = dataDeInsercao;
	}



	
	@Override
	public String toString() {
		return "Funcionario [funcionarioID=" + funcionarioID + ", chave=" + chave + ", nome=" + nome + ", sobreNome="
				+ sobreNome + ", dataAdmissao=" + dataAdmissao + ", sexo=" + sexo + ", nascimento=" + nascimento
				+ ", email=" + email + ", ctps=" + ctps + ", paisID=" + paisID + ", ctpsnum=" + ctpsnum + ", ctpsserie="
				+ ctpsserie + ", dataDeInsercao=" + dataDeInsercao + "]";
	}


	

}
