package com.pessoa.service;

import java.util.Random;

public class GeradorCodClientUtil {

	public static GeradorCodClientUtil gerador;
	
	public synchronized static GeradorCodClientUtil instance() {
		if(gerador == null)gerador = new GeradorCodClientUtil();
		return gerador;
	}
	
	private GeradorCodClientUtil() {
	}
	
	public synchronized long newCod() {
		return new Random().nextLong();
	}
	
}
