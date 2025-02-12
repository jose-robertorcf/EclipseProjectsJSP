package br.com.xyz.principal;

import br.com.xyz.pessoa.PessoaJuridica;

public class Principal {

	public static void main(String[] args) {
		
		PessoaJuridica pj = new PessoaJuridica();
		
		pj.setApelido("Empresa XYZ");
		System.out.println(pj.getApelido());

	}

}
