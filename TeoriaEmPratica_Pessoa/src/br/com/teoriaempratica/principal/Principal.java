package br.com.teoriaempratica.principal;

import br.com.teoriaempratica.pessoas.PessoaFisica;

public class Principal {

	public static void main(String[] args) {
	
		PessoaFisica pf = new PessoaFisica();
		
		pf.setNome("Claudia");
		pf.setApelido("Clau");
		pf.setCpf("000.000.000-00");
		pf.imprimirInformacoes();
		
		

	}

}
