package com.br.fiap;

public class Funcionario {
	private String nome;
	private float valorHora;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	public float salario(int qtdHorasTrabalhadas) {
		float salario = (valorHora * qtdHorasTrabalhadas) * 4;
		return salario;
	}
	
}
