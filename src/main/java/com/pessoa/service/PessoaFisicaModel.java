package com.pessoa.service;

public class PessoaFisicaModel extends PessoaModel {

	private String nome;
	private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String getDescription() {
		return "Pessoa física "+this.nome;
	}

}
