package com.pessoa.service;

public class ModelJaExisteException extends ApplicationException {

	private static final long serialVersionUID = 1L;

	private Model model; 
	
	public ModelJaExisteException(Model model) {
		this.model = model;
	}
	
	@Override
	public String getMessage() {
		return this.model.getDescription()+" já existe no sistema";
	}

}
