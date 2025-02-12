package br.com.xyz.pessoa;

import java.util.Date;

public abstract class Pessoa {
	
	//Estados da classe ou Atributos
	
	private String nome;
	private String apelido;
	private Date criacao;
	
	
	//Métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public Date getCriacao() {
		return criacao;
	}
	public void setCriacao(Date criacao) {
		this.criacao = criacao;
	}
	
	public abstract void imprimirDados();
	

}
