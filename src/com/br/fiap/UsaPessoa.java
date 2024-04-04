package com.br.fiap;

public class UsaPessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setNome("Leticia Resina");
		pessoa1.setAnoNascimento(2004);
		
		int idade = pessoa1.calculaIdade(2024);
		
		System.out.println(pessoa1.getNome() + " a sua idade é " 
				+ idade);
	}

}
