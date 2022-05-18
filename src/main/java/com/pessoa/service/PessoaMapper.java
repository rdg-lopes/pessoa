package com.pessoa.service;

import java.util.List;
import java.util.stream.Collectors;

import com.pessoa.repository.PessoaFisicaEntity;

public class PessoaMapper {

	public PessoaFisicaEntity toEntity(PessoaFisicaInputModel input) {
		PessoaFisicaEntity entity = new PessoaFisicaEntity();
		entity.setCpf(input.getCpf());
		entity.setNome(input.getNome());
		return entity;
	}
	
	public PessoaFisicaModel map(PessoaFisicaEntity entity) {
		PessoaFisicaModel model = new PessoaFisicaModel();
		model.setCodPessoa(entity.getCodPessoa());
		model.setCpf(entity.getCpf());
		model.setNome(entity.getNome());
		return model;
	}
	
	public List<PessoaFisicaModel> mapList(List<PessoaFisicaEntity> listEntity){
		return listEntity.stream().map(this::map).collect(Collectors.toList());
	}
	
}
