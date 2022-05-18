package com.pessoa.service;

public class PessoaFisicaInputModel implements Model {

	private String cpf;
	private String nome;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getDescription() {
		return "Pessoa física "+this.nome;
	}

}
