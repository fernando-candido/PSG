package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Funcionario {
	
    private int funcionarioID;
    private long chaveID;   
    private String nome;
    private String sobreNome;
    private String dataAdmissao;
	private String sexo;
    private Date nascimento;
    private String email;
    private String ctps;
    private int ctpsnum;
    private int ctpsserie;
    private int paisID;
    
    
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
	
	
	@Override
	public String toString() {
		return "Funcionario [funcionarioID=" + funcionarioID + ", chaveID=" + chaveID + ", nome=" + nome
				+ ", sobreNome=" + sobreNome + ", dataAdmissao=" + dataAdmissao + ", sexo=" + sexo + ", nascimento="
				+ nascimento + ", email=" + email + ", ctps=" + ctps + ", ctpsnum=" + ctpsnum + ", ctpsserie="
				+ ctpsserie + ", paisID=" + paisID + "]";
	}
	
	
	public Funcionario(int funcionarioID, long chaveID, String nome, String sobreNome, String dataAdmissao, String sexo,
			Date nascimento, String email, String ctps, int ctpsnum, int ctpsserie, int paisID) {
		super();
		this.funcionarioID = funcionarioID;
		this.chaveID = chaveID;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dataAdmissao = dataAdmissao;
		this.sexo = sexo;
		this.nascimento = nascimento;
		this.email = email;
		this.ctps = ctps;
		this.ctpsnum = ctpsnum;
		this.ctpsserie = ctpsserie;
		this.paisID = paisID;
	}

	
	public Funcionario () {}
	
	

}
