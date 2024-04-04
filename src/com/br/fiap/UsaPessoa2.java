package com.br.fiap;

import java.util.Scanner;

public class UsaPessoa2 {
	public static void main(String[] args) {
		// instanciando classes
		Pessoa pessoa1 = new Pessoa();
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite seu nome");
			pessoa1.setNome(scan.nextLine());
			
			System.out.println("Digite o seu ano de nascimento");
			pessoa1.setAnoNascimento(scan.nextInt());
			
			System.out.println(pessoa1.getNome() + " sua idade é " +
			pessoa1.calculaIdade(2024));
			
		} catch (Exception e) {
			System.out.println("Nome e/ou ano de nascimento inválido");
		}
		
	}
}
