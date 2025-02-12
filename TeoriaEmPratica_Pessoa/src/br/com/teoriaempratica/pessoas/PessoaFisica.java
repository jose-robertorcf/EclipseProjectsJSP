package br.com.teoriaempratica.pessoas;

public class PessoaFisica extends Pessoa implements InterfacePessoa {
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void verificaPessoa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimirInformacoes() {
		System.out.println("Nome: " + getNome() + " Apelido: " + getApelido() + " CPF: " + getCpf());
		
	}
	
	

}
