package com.pessoa.service;

public class ApplicationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ApplicationException() {
	}
	
	public ApplicationException(String msg) {
		super(msg);
	}

	public ApplicationException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
