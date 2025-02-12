package br.com.teoriaempratica.pessoas;

public abstract class Pessoa {

	private String nome;
	private String apelido;
	
	
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
	
	
	public abstract void verificaPessoa();
	
}
