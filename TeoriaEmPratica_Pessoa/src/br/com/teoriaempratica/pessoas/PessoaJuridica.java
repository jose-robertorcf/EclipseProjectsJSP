package br.com.teoriaempratica.pessoas;

public class PessoaJuridica extends Pessoa implements InterfacePessoa {

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void verificaPessoa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimirInformacoes() {
		System.out.println("Razão Social: " + getNome() + " Nome fantasia: " + getApelido() + " CNPJ: " + getCnpj());
		
	}
	
	
	
	
}
