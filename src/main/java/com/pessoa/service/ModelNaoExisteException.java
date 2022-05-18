package com.pessoa.service;

public class ModelNaoExisteException extends ApplicationException {

	private static final long serialVersionUID = 1L;
	
	private Model model;
	
	public ModelNaoExisteException(Model model) {
		this.model = model;
	}
	
	@Override
	public String getMessage() {
		return this.model.getDescription()+" não existe no sistema.";
	}

}
