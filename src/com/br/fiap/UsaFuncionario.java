package com.br.fiap;

public class UsaFuncionario {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		
		func.setNome("Leticia");
		
		func.setValorHora(0.5f);
		
		float salario = func.salario(180);
		
		System.out.println(salario);

	}

}
