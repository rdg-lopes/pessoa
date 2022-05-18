package com.pessoa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pessoa.repository.PessoaFisicaEntity;
import com.pessoa.repository.PessoaFisicaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaFisicaRepository pessoaFisicaRepository;
	
	public PessoaFisicaModel criarPessoaFisica(PessoaFisicaInputModel pessoa) {
		Optional<PessoaFisicaEntity> entity = this.pessoaFisicaRepository.findByCpf(pessoa.getCpf());
		if(entity.isPresent()) {
			throw new ModelJaExisteException(pessoa);
		}
		PessoaFisicaEntity newEntity = new PessoaMapper().toEntity(pessoa);
		newEntity.setTipo(TipoPessoa.FISICA.getCodigo());
		newEntity.setCodPessoa(GeradorCodClientUtil.instance().newCod());
		this.pessoaFisicaRepository.save(newEntity);
		return new PessoaMapper().map(newEntity);
	}
	
	public List<PessoaFisicaModel> getPessoas(String str, int page, int size){
		Pageable pag = PageRequest.of(page, size);
		List<PessoaFisicaEntity> pessoas = this.pessoaFisicaRepository.findByNomeContaining(str, pag);
		return new PessoaMapper().mapList(pessoas);
	}
	
}
