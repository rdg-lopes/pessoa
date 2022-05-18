package com.pessoa.service;

public abstract class PessoaModel implements Model {

	private Long codPessoa;
	private TipoPessoa tipoPessoa;

	public Long getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(Long codPessoa) {
		this.codPessoa = codPessoa;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
}
