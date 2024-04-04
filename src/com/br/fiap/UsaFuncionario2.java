package com.br.fiap;

import java.util.Scanner;

public class UsaFuncionario2 {
	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		
		Scanner scan;
		
		try {
			
			scan = new Scanner(System.in);
			
			System.out.println("Digite seu nome");
			func.setNome(scan.nextLine());
			
			System.out.println("Digite o valor recebido por horas trabalhadas");
			func.setValorHora(scan.nextFloat());
			
			System.out.println("Digite a quantidade de horas trabalhadas");
			int horasTrabalhadas = scan.nextInt();
			
			System.out.println(func.getNome() + ", seu salário é de " + 
					func.salario(horasTrabalhadas));
			
		} catch (Exception e) {
			System.out.println("Nome e/ou valor hora/horas trabalhadas inválidos");
		}
	}
}
