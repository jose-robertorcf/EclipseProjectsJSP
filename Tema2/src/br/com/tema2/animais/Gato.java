package br.com.tema2.animais;

public class Gato extends Animal {

	private float tamanho;

	
	
	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
	public void ronronar() {
		System.out.println("O gato está ronronando!");
	}

	@Override
	public void andar() {
		
		System.out.println("O gato está andando!");		
	}

	@Override
	public void brincar() {

		System.out.println("O gato está brincando!");
		
	}
	
	
}
