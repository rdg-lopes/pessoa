package com.pessoa.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.pessoa.service.PessoaFisicaInputModel;
import com.pessoa.service.PessoaFisicaModel;

public class PessoaMapper {

	public PessoaFisicaInputModel map(PessoaFisicaInputDTO dto) {
		PessoaFisicaInputModel model = new PessoaFisicaInputModel();
		model.setCpf(dto.getCpf());
		model.setNome(dto.getNome());
		return model;
	}
	
	public PessoaFisicaDTO map(PessoaFisicaModel model) {
		PessoaFisicaDTO dto = new PessoaFisicaDTO();
		dto.setCodigo(model.getCodPessoa());
		dto.setCpf(model.getCpf());
		dto.setNome(model.getNome());
		return dto;
	}
	
	public List<PessoaFisicaDTO> toList(List<PessoaFisicaModel> listModel){
		return listModel.stream().map(this::map).collect(Collectors.toList());
	}
	
}
