package br.com.xyz.pessoa;

public class PessoaJuridica extends Pessoa {

	private int cnpj;
	private String[] socios;
		
	
	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String[] getSocios() {
		return socios;
	}

	public void setSocios(String[] socios) {
		this.socios = socios;
	}



	@Override
	public void imprimirDados() {
		System.out.println("O nome da empresa é: " + getNome() + "\nA razão social é: " + getApelido() 
		+ "\nA data de criação é: " + getCriacao() + "\nO CNPJ é: " + getCnpj());
		for(String socio : getSocios()) {
			System.out.println("Sócio: " + socio + "\n");
		}
		
	}

	
}
