package com.pessoa.service;

public enum TipoPessoa {
	
	FISICA(1), 
	JURIDICA(2);

	private int codigo;
	
	private TipoPessoa(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
}
